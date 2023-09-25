import java.util.*;

public class queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < 5; i++) {
			queue.add(i*10);
			stack.add(i*100);
		}
		System.out.println("Queue : ");
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		System.out.println();
		System.out.println("Stack : ");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		Deque<Integer> deque = new ArrayDeque<>();  
		for(int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				deque.addFirst(i*10);
			}
			else {
				deque.addLast(i*100);
			}
		}
		System.out.println();
		while(!deque.isEmpty()) {
			System.out.println(deque.poll());
		}

		int arr[] = {90,2,53,14,74};
		// PriorityQueue used as Heap
		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}