import java.util.*;

public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		maxheap.add(90);
		maxheap.add(90);
		maxheap.add(90);
		maxheap.add(90);  
		maxheap.add(60);
		maxheap.add(740);
		maxheap.add(30);
		maxheap.add(20);
		while(!maxheap.isEmpty()) {
			System.out.print(maxheap.poll() + " ");
		}
		System.out.println();

		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		minheap.add(90);
		minheap.add(60);
		minheap.add(740);
		minheap.add(30);
		minheap.add(20);
		while(!minheap.isEmpty()) {
			System.out.print(minheap.poll() + " ");
		}
		System.out.println();
 	}
}