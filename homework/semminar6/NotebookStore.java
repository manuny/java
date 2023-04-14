package homework.semminar6;

import java.util.*;

public class NotebookStore {
	private Set<Notebook> notebooks;

	public NotebookStore() {
		this.notebooks = new HashSet<>();
		notebooks.add(new Notebook("Apple", "MacBook Pro", 16, 512, "macOS", "Silver"));
		notebooks.add(new Notebook("Dell", "XPS 13", 8, 256, "Windows 10", "Rose Gold"));
		notebooks.add(new Notebook("HP", "Spectre x360", 16, 1_000, "Windows 10", "Nightfall Black"));
		notebooks.add(new Notebook("Lenovo", "ThinkPad X1 Carbon", 16, 512, "Windows 10", "Black"));
		notebooks.add(new Notebook("Asus", "ZenBook UX425", 8, 512, "Windows 10", "Pine Grey"));
	}

	public static void main(String[] args) {
		NotebookStore notebookStore = new NotebookStore();

		Scanner scanner = new Scanner(System.in);

		Map<String, Object> filterCriteria = new HashMap<>();

		System.out.println("Введите цифру, соответствующую необходимому критерию:");
		System.out.println("1 - ОЗУ");
		System.out.println("2 - Объём ЖД");
		System.out.println("3 - Операционная система");
		System.out.println("4 - Цвет");

		int option = scanner.nextInt();
		scanner.nextLine(); // очистка буфера

		switch (option) {
			case 1:
				System.out.print("Введите минимальный объём ОЗУ: ");
				int ram = scanner.nextInt();
				filterCriteria.put("ram", ram);
				break;
			case 2:
				System.out.print("Введите минимальный объём жёсткого диска: ");
				int storage = scanner.nextInt();
				filterCriteria.put("storage", storage);
				break;
			case 3:
				System.out.print("Введите название операционной системы: ");
				String os = scanner.nextLine();
				filterCriteria.put("os", os);
				break;
			case 4:
				System.out.print("Введите цвет ноутбука: ");
				String color = scanner.nextLine();
				filterCriteria.put("color", color);
				break;
			default:
				System.out.println("Некорректный ввод.");
				scanner.close();
				return;
		}

		Set<Notebook> filteredNotebooks = filterNotebooks(notebookStore.notebooks, filterCriteria);

		System.out.println("Результаты поиска:");
		for (Notebook notebook : filteredNotebooks) {
			System.out.printf("%s %s (%s, %d ГБ ОЗУ, %d ГБ ЖД, %s)%n",
					notebook.getBrand(),
					notebook.getModel(),
					notebook.getOs(),
					notebook.getRam(),
					notebook.getStorage(),
					notebook.getColor());
		}

		scanner.close();
	}

	// Метод для фильтрации ноутбуков по заданным критериям
	public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filterCriteria) {
		Set<Notebook> filteredNotebooks = new HashSet<>();

		for (Notebook notebook : notebooks) {
			boolean match = true;

			for (String key : filterCriteria.keySet()) {
				if (key.equals("ram")) {
					int minRam = (int) filterCriteria.get(key);
					if (notebook.getRam() < minRam) {
						match = false;
						break;
					}
				} else if (key.equals("storage")) {
					int minStorage = (int) filterCriteria.get(key);
					if (notebook.getStorage() < minStorage) {
						match = false;
						break;
					}
				} else if (key.equals("os")) {
					String os = (String) filterCriteria.get(key);
					if (!notebook.getOs().equalsIgnoreCase(os)) {
						match = false;
						break;
					}
				} else if (key.equals("color")) {
					String color = (String) filterCriteria.get(key);
					if (!notebook.getColor().equalsIgnoreCase(color)) {
						match = false;
						break;
					}
				}
			}

			if (match) {
				filteredNotebooks.add(notebook);
			}
		}

		return filteredNotebooks;
	}
}

class Notebook {
	private String brand;
	private String model;
	private int ram;
	private int storage;
	private String os;
	private String color;

	public Notebook(String brand, String model, int ram, int storage, String os, String color) {
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
		this.os = os;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	public String getOs() {
		return os;
	}

	public String getColor() {
		return color;
	}
}