import java.util.*;

public class array {
	int count = 0;

	public static void main(String[] args) {
		int arr[] = new int[5];
		array obj = new array();
		obj.insert(arr, 90);
		obj.insert(arr, 10);
		obj.insert(arr, 20);
		obj.insertAtStart(arr, 120);
		obj.insertAtStart(arr, 100);

		obj.insertAtPostion(arr, 3, 1000);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void insert(int arr[], int val) {
		if (count < arr.length) {
			arr[count++] = val;	
		}
	}

	public void insertAtStart(int arr[], int val) {
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = val;
	}

	public void insertAtPostion(int arr[], int position, int val) {
		for(int i = arr.length-1; i > position-1; i--) {
			arr[i] = arr[i-1];
		}
		arr[position-1] = val;
	}

}