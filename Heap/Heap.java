import java.util.*;

public class Heap {
	static int size;
	public static void main(String[] args) {
		int[] arr = new int[20];
		insert(arr,23);
		insert(arr,2);
		insert(arr,25);
		insert(arr,90);
		insert(arr,100);
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("This is sorted array desending");
		while(size > 0) {
			System.out.print(removeMax(arr) + " ");
		}
		System.out.println();
		// System.out.println(removeMax(arr));
	}

	public static void insert(int arr[], int value) {
		arr[size] = value;
		int index = size;
		int parent = (index - 1)/2;

		while(parent >= 0 && arr[parent] < arr[index]) {
			int x = arr[parent];
			arr[parent] = arr[index];
			arr[index] = x;

			index = parent;
			parent = (index - 1)/2;
		}
		size++;
	}

	public static int removeMax(int[] arr) {
    	int max = arr[0];
    	arr[0] = arr[size -1];
    	size = size - 1;
    	maxHeapify(arr,0);
    	return max;
  	}

	public static void maxHeapify(int[] arr,int index) {
    	int l, r;
    	l = 2 * index + 1;
    	r = 2 * index + 2;
    
    	int largest = index; 
    	if(l < size && arr[l] > arr[largest]) {
      		largest = l;
    	}
    
    	if(r < size && arr[r] > arr[largest]) {
      		largest = r;
    	}
    
    	if(largest != index) {
      		int t = arr[largest];
      		arr[largest] = arr[index];
      		arr[index] = t;
      		maxHeapify(arr, largest);
    	}
  	}

}

