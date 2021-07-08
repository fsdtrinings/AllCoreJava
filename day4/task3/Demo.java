package day4.task3;

import day4.task1.Car;

public class Demo {
	
	int arr[] = new int[5];
	
	Car cars[] = new Car[5];
	
	
	public void abc()
	{
		String carName = cars[2].getCarName(); // it will give NULLPOINTERException
		
	}
	
	public void insertCar(Car car)
	{
		cars[0] = car;
		
	}
	
	public void searchNumber(int searchNumber)
	{
		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		new Demo().insertCar(c);
	}

}
