package homework.semminar1;

import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		Scanner iScanner = new Scanner(System.in);

		System.out.printf("Введите первое число: ");
		boolean flag_1 = iScanner.hasNextInt();
		System.out.println(flag_1);
		int number_1 = iScanner.nextInt();

		System.out.printf("Введите знак оперции '+', '-','*', '/': ");
		boolean flag_3 = iScanner.hasNext();
		System.out.println(flag_3);
		String sign = iScanner.next();

		System.out.printf("Введите второе число: ");
		boolean flag_2 = iScanner.hasNextInt();
		System.out.println(flag_2);
		int number_2 = iScanner.nextInt();

		iScanner.close();

		double res = 0.0;
		switch (sign.toString()) {
			case "*":
				res = number_1 * number_2;
				break;
			case "+":
				res = number_1 + number_2;
				break;
			case "-":
				res = number_1 - number_2;
				break;
			case "/":
				res = number_1 / number_2;
				break;
			default:
				break;
		}
		System.out.println(number_1 + " " + sign + " " + number_2 + " = " + res);

	}
}
