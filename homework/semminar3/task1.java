package homework.semminar3;

import java.util.ArrayList;

/*Дан произвольный список целых чисел, удалить из него чётные числа */

public class task1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(22);
		numbers.add(45);
		numbers.add(12);
		numbers.add(11);
		numbers.add(13);
		numbers.add(3);
		numbers.add(15);

		System.out.println("Список: " + numbers);

		numbers.removeIf(n -> n % 2 == 0);

		System.out.println("Список без четных чисел: " + numbers);

	}
}