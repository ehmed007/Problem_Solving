import java.util.*;

public class shuffleArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};
		shuffle(arr);
	}

	public static void shuffle(int[] arr) {
 		for (int i = 0; i < arr.length; i++) {
 			System.out.print(arr[i] + " ");
 		}
 		System.out.println();

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			int randNumber = rand.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[randNumber];
			arr[randNumber] = temp;
 		}

 		for (int i = 0; i < arr.length; i++) {
 			System.out.print(arr[i] + " ");
 		}
 		System.out.println();
	}
}