import java.util.*;

public class kthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 30, 20, 38, 2, 45};
        int k = 3;
        System.out.println(searchUsingMaxHeap(arr, k));
        System.out.println(searchUsingMinHeap(arr, k));
    }   

    public static int searchUsingMaxHeap(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        } 
        while(k > 0) {
            maxHeap.poll();
            k--;
        }
        return maxHeap.poll();
    }

    public static int searchUsingMinHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k+1; i < arr.length; i++) {
            if(arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }

}
