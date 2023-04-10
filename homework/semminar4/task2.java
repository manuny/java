package homework.semminar4;

/*enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
import java.util.Arrays;
import java.util.LinkedList;

public class task2 {
	public static void main(String[] args) {
		Integer[] numbers = { 113, 21, 42, 5, 10, 300, 226 };
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(numbers));
		System.out.println("Очередь  элементов перед преобразованиями: ");
		System.out.println(ll);

		System.out.println("помещает элемент в конец очереди:");
		LinkedList<Integer> ll_back_order = enqueue(ll);
		System.out.println(ll_back_order);

		System.out.println(" возвращает первый элемент из очереди и  удаляет его: ");
		LinkedList<Integer> ll_fisrt_return_and_delete = dequeue(ll);
		System.out.println(ll_fisrt_return_and_delete);

		System.out.println(" возвращает первый элемент из очереди, не удаляя: ");
		fisrt(ll);

	}

	private static void fisrt(LinkedList<Integer> ll_in) {
		System.out.printf("%d - первый элемент очереди", ll_in.getFirst());
		System.out.println("\n" + ll_in);
		return;
	}

	// Метод FILO
	static LinkedList<Integer> enqueue(LinkedList<Integer> ll_in) {
		LinkedList<Integer> ll_out = new LinkedList<>();
		for (Integer item : ll_in) {
			ll_out.addFirst(item);
		}
		return ll_out;
	}

	// Метод найти первый элемент и удалить его
	private static LinkedList<Integer> dequeue(LinkedList<Integer> ll_in) {
		LinkedList<Integer> ll_out = new LinkedList<>();
		System.out.printf("%d - первый элемент\n", ll_in.get(0));
		ll_in.pop();
		for (Integer item : ll_in) {
			ll_out.addLast(item);
		}
		return ll_out;
	}

}
