package day2.task2;

public class MethodDemo {
	
	
	public static void main(String[] args) {
		float add = 0;
		MethodDemo obj = new MethodDemo();
		obj.abc(15, 78, (float)(2.8));
		
		byte b = 127; //
		byte c = 3;
		
		byte x = (byte)(b+c);
		System.out.println(x);
		
		int i = 32770;
		short s = (short)(i); // 32767
		System.out.println(s);
		
		// ----------------------
		
		obj.abc(100,1,10.33f);
		
		obj.changesInadd(add);
		
	}
	
	public void changesInadd(float add)
	{
		add++;
	}
	
	public void print(float add)
	{
		System.out.println(add);
	}
	
	public int abc(int x,int y,float p)
	{
		float add = x+y+p;
		return (int)(add);
	}
	public int doThings(int x,int y)throws ArithmeticException
	{
		if(y == 0)throw new ArithmeticException();
		else return x/y;
	}

}








