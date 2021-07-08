package day2.task1;

public class StaticDemo {

	int x = 10;
	static int y = 10;
	
	public static void main(String[] args) {
		/*  Call non static method through object of the class*/
		StaticDemo obj = new StaticDemo();
		
		obj.x= 90;
		y = 999;
		
		
		obj.doThings();
		doSomeThing(obj);
	}
	
	public void doThings()
	{
		x = 90;
		y = 88;
	
		System.out.println(" inside do Things");
	}
	
	public static void doSomeThing(StaticDemo obj)
	{
		obj.x = 888;
		y = 666;
		//doThings();
		System.out.println(" inside doSomeThing");
	}
	
	
	
}
