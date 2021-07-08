package day6.task1;

public class MainApp {
	
	public static void main(String[] args) {
		
		ElectronicDevice device[] = new ElectronicDevice[4000];
		device[0] = new MobilePhone();
		device[1] = new Printer();

		
		Bluetooth x = new Laptop("HP-101");
		
		new MainApp().userShareFile(x);
		
		new MainApp().userShareFile(new Bluetooth() {
			
			@Override
			public void doSHareFiles() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void doBluetoothConnection() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
	
	public void userShareFile(Bluetooth b) 	
	{
		b.doBluetoothConnection();
		b.doSHareFiles();
	}
	
	
	
	
	public void doThings(ElectronicDevice device)
	{
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.doCalling();
		}
		if(device instanceof Printer)
		{
			((Printer)device).doPrinting("c:\\MyDoc.txt");
			
		}
		
		device.doSwitchOff();
		
	}

}
