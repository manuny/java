package homework.semminar1;

/* Вывести все простые числа от 1 до 1000 */

public class two {
	public static void main(String[] args) {

		for (int j = 2; j <= 1000; j++) {
			boolean result = false;

			for (int i = 2; i * i <= j; i++) {
				result = (j % i == 0);
				if (result == true) {
					break;
				}
			}
			if (result == false) {
				System.out.print(j + " ");
			}
		}
	}
}
