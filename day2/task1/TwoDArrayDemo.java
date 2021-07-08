package day2.task1;

public class TwoDArrayDemo {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		
		arr[0][0] = 55; 
		arr[0][1] = 74;
		arr[0][2] = 78;
		
		arr[1][0] = 155; 
		arr[1][1] = 174;
		arr[1][2] = 178;
		
		System.out.println(arr[1][2]);
		
		for (int[] secondarr : arr) {
			for (int data : secondarr) {
				System.out.print(" "+data);
			}
			System.out.println("\n");
		}
				
		
	}//end main
}//end class
