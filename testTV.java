
public class testTV {

	public static void main(String[] args) {
		
		TV t1 = new TV();
		System.out.println(t1);
		t1.turnOn();
		t1.channelUp(20);
		t1.volumeLevelUp(6);
		
		
		
		if(t1.isOn())
			System.out.println(t1.toString());
	
		t1.turnOff();
		
	}

}
