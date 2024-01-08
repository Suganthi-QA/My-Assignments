package week3.day2;

public class Button extends WebElement {
public void submit()
{
	System.out.println("Submit the method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Button btn=new Button();
      btn.Click();
      btn.SetText("Hello");
      btn.submit();
	}

}
