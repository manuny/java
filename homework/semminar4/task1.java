package homework.semminar4;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список

import java.util.Collections;
import java.util.LinkedList;

public class task1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("22");
		list.add("33");
		list.add("44");
		LinkedList<String> reversedList = reverseLinkedList(list);
		System.out.println(reversedList); // [44, 33, 22]
	}

	public static LinkedList reverseLinkedList(LinkedList list) {
		Collections.reverse(list);
		return list;
	}
}