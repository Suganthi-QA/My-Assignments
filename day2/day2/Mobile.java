package Week1.day2;

public class Mobile {
	//Assignmnet 2
	/*Create package name as week1.day1 under src/main/java
	- Create a  new class as "Mobile" under week1.day1
	- Create 2 methods (makeCall() , sendMsg()) with simple print statement
	- In first method create variable  mobileModel (String),mobileWeight (float)
	- In second method create variable  isFullCharged (boolean),mobileCost (int)
	- Create main method
	  Create object for class and call  from main method and print them
	- print a statement---->"This is my mobile";
	-run and confirm the output printed in console */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile action=new Mobile();
		System.out.println("This is my mobile information");
		System.out.println("*******************************");
		action.makeCall();
		action.sendMsg();
		
	}
	public void makeCall() 
	{
		String mobilemodel="Samsung galaxy91";
		Float mobileWeight=300.00f;
		System.out.println("Mobile Name is :"+mobilemodel);
		System.out.println("Mobile weight is: "+mobileWeight);
		
	}
	
	public void sendMsg()
	{
		boolean isFullCharged=false;
		int mobileCost=40000;
		System.out.println("Is mobile Fully charged?"+isFullCharged);
		System.out.println("Cost of the mobile is :"+mobileCost);
		
	}
}
