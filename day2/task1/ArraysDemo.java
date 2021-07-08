package day2.task1;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int arr[] = {7,8,9,6,5,44};
		
		int arr2[] = new int[4];  // 0-3 index
		
		System.out.println(arr.length); // 6
		
		
		arr2[0] = 90;
		arr2[3] = 88;
		//arr2[4] = 900; // Runtime exception
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(" ---------");
		
		for (int x : arr2) {
			System.out.println(x);
		}
		
			
		
	}
}
