package homework.semminar3;

import java.util.ArrayList;
import java.util.Collections;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.

public class task2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(94);
		list.add(18);
		list.add(64);
		list.add(12);
		list.add(8);

		System.out.println("Список: " + list);

		int min = Collections.min(list);
		int max = Collections.max(list);
		double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

		System.out.println("Минимальное значение: " + min);
		System.out.println("Максимальное значение: " + max);
		System.out.println("Среднее арифметическое значение: " + average);
	}
}