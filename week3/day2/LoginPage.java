package week3.day2;

public class LoginPage extends BaseClass {

	public void EnterText()
	{
		System.out.println("Welcome to login page");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginPage mylogin= new LoginPage();
      mylogin.findElement();
      mylogin.EnterText();
      
	}

}
