package homework.semminar2;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
 */

public class task2 {
	public static void main(String[] args) throws IOException {
		String pathfile = "File_test.txt";
		File file = new File(pathfile);
		System.out.println("All info in  file " + file.toPath());
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String str_a;

		while ((str_a = bufferedReader.readLine()) != null) {
			// System.out.printf("== %s ==\n", str_a);
			String[] str_sub = str_a.split(",", 0);
			StringBuilder sb_a = new StringBuilder();
			for (int k = 0; k < str_sub.length; k++) {
				sb_a.append(str_sub[k]);
			}

			String str_b = (sb_a.toString().replace(":", " ").replace("\"", " ").replace("Last", "Студент")
					.replace("grade", " Получил").replace("subject", "по предмету"));
			System.out.println(str_b);
		}
		bufferedReader.close();

	}
}
