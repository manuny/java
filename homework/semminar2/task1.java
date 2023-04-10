package homework.semminar2;

import java.io.File;
import java.io.FileWriter;

public class task1 {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 6, 7, 113, 7, 42, 21, 56 };
		System.out.println("\n" + "Это массив до сортировки: ");
		for (int item : array) {
			System.out.printf("%d, ", item);
		}
		System.out.println("\n" + "Далее сортировка массива по шагам: ");
		// Файл text.txt открывается для логорования
		String file_name = "1.txt";
		File file = new File(file_name);
		try {
			FileWriter writer_a = new FileWriter(file, false);
			writer_a.write(String.format("\n" + "Это массив до сортировки: "));
			writer_a.write(String.format("\n"));
			for (int i = 0; i < array.length; i++) {
				writer_a.write(String.format("%d ", array[i]));
			}
			writer_a.write(String.format("\n"));
			writer_a.write(String.format("Сортировка по шагам:" + "\n"));
			// Сортировка: метод "пузырьком", вывод итераций на экран и запись в файл
			int temp = 0;
			for (int k = 0; k < array.length; k++) {
				// writer_a.write(String.format("\n" + "Шаг №: " + "%d" + " ", k));
				// writer_a.write(String.format("\n"));
				for (int l = k + 1; l < array.length; l++) {
					if (array[k] >= array[l]) {
						temp = array[k];
						array[k] = array[l];
						array[l] = temp;
					} else {
						continue;
					}
					// Этот блок нужно записать в файл, для этого:
					for (int item : array) {
						System.out.printf("%d, ", item);
					}
					// Запись в файл очередной итерации при сортировке массива

					// writer_a.write(String.format("Шаг №: " + "%d" + " ", k));
					writer_a.write("\n");
					for (int i = 0; i < array.length; i++) {
						writer_a.write(String.format("%d ", array[i]));
					}

					// System.out.println("\n" + "Текст записан в файл file.txt");
					System.out.println("\n");
					System.out.println("\n" + "Очередная итерация записана в файл file.txt");
				}
			}
			writer_a.close();

		} catch (Exception e) {

		}

	}
}
