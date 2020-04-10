package week1.day1;

// Simple program to create objects, accessing methods and variables using the objects
public class Mobile {
	int batteryPercentage = 68;
	String model ="iPhone";
	private static boolean sendSMS1;

	public void dialCaller() {
		System.out.println("I am calling my friend");
			}
	
	public boolean sendSMS() {
	return true;
	
	}

public static void main(String[] args) {
		Mobile cellPhone = new Mobile();
	cellPhone.dialCaller();
	sendSMS1 = cellPhone.sendSMS();
	System.out.println("I messaged by friend which is "+sendSMS1);
	System.out.println("My Battery percentage is "+ cellPhone.batteryPercentage);
	System.out.println("My Phone model is "+cellPhone.model);

}
}

/* This is working as expected */


// shortcuts
//Ctrl+F11 to run the Java application
//Ctrl++ to zoom in the editor
//syso Ctrl+spacebar