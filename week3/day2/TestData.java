package week3.day2;
//Create a superclass as TestData.
//Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData class.
public class TestData  extends LoginTestData{

	public void enterCredentials()
	{
		System.out.println("Provide the Credentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("Navigate to HomePage");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData mylogin=new TestData();
		mylogin.enterCredentials();
		mylogin.enterUsername();
		mylogin.enterPassword();
		mylogin.navigateToHomePage();

	}

}
