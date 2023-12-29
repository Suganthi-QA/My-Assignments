package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExcersise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
        WebElement loginbtn=driver.findElement(By.name("login"));
        loginbtn.click();
       WebElement forgotlink= driver.findElement(By.linkText("Find your account and log in."));;
	   forgotlink.click();
	   Thread.sleep(2000);
	    String title=driver.getTitle();
	    //System.out.println(title);
	    if (title.contains("Forgotten Password"))
	    {
	    	System.out.println("Title page verified ");
	    }
	    else
	    {
	    	System.out.println("Cant able to find out the page ");
	    }
	    
	   
	}

}
