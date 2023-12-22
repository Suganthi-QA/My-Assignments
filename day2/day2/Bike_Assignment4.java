package Week1.day2;

public class Bike_Assignment4 extends Car_Assignment4  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car_Assignment4 carAction=new Car_Assignment4();
		Bike_Assignment4 bikeAction=new Bike_Assignment4();
		System.out.println("Car actions are ");
		System.out.println("*****************");
		carAction.applyBeak();
		carAction.soundHorn();
		System.out.println("\n ");
		System.out.println("Bike actions are ");
		System.out.println("*****************");
		bikeAction.applyBeak();
		bikeAction.soundHorn();
		
	}

}
