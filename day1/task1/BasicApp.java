package day1.task1;

public class BasicApp {

	public static void main(String[] args) {
		/*
		 * System.out.println(" * "); System.out.println(" * * ");
		 * System.out.println(" * * *"); System.out.println(" * * * *");
		 */
		int limit = 10; // entered by user

		for (int r = 0; r < limit; r++) {
			for (int c = 0; c <= r; c++) {
				if(r == 0 || r == (limit-1))
				{
					System.out.print(" * ");
				}
				else 
				{
					if(c==0 || c==r)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				
			}

			System.out.print("\n");
		}

	}// end main

}// end class
