
public class TV {

	public int channel;
	public int volumeLevel;
	public boolean on;
	
	
	
	
	public void turnOn(){
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public boolean isOn() {
		return on; //retuned value can be assigned to variable of the same type.
	}
	
	public void volumeLevelUp(int volume) {
		if(volumeLevel + volume >=8)//volume Level should not exceed number 8
		volumeLevel = 8;
		else 
			volumeLevel+=volume;
	}
	
	public void volumeLevelDown(int volume) {
		if (volumeLevel - volume<0)
			volumeLevel = 0;
		else 
			volumeLevel -= volume;
	}
	
	public void channelUp(int ch) {
		if(channel+ch>=100 )
			channel = 100;
		else 
			channel+=ch;
	}
	
	
	public void channelDown(int ch) {
		if(channel - ch <=0)
			channel =0;
		else 
			channel-=ch;
	}
	
	
	public String toString() {
		
		String tv = "TV is ";
		if(on) tv+="On ";
		else tv+="Off ";
		tv += "and current channel is "+channel+" and volume level is "+volumeLevel+".";
		 return tv;
	}
}
