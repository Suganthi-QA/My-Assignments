package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHabdlingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     //Enter the username and password.
	     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	     //Click on the Login button.
		 driver.findElement(By.className("decorativeSubmit")).click();
	     //Click on the CRM/SFA link.
		 driver.findElement(By.linkText("CRM/SFA")).click();
	     // Click on the Contacts button.
		 driver.findElement(By.xpath("//*[text()='Contacts']")).click();
	     //Click on Merge Contacts.
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	     // Click on the widget of the "From Contact".
		 driver.findElement(By.xpath("(//a[contains(@href,'javascript:call_')])[1]/img")).click();
		 //String fromwindow=driver.getWindowHandle();
		 Set<String> fromcontact=driver.getWindowHandles();
		 List<String> fromwindows=new ArrayList<String>(fromcontact);
		 driver.switchTo().window(fromwindows.get(1));
	    // Click on the first resulting contact.
		 driver.findElement(By.xpath("//*[@class='linktext'][1]")).click();
		 driver.switchTo().window(fromwindows.get(0));
	     //Click on the widget of the "To Contact".
		 driver.findElement(By.xpath("(//a[contains(@href,'javascript:call_')])[2]/img")).click();
		 Set<String> towindow=driver.getWindowHandles();
		 List<String> towindows=new ArrayList<String>(towindow);
		 driver.switchTo().window(towindows.get(1));
		//Click on the second resulting contact.
		 driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[2]")).click();
		 driver.switchTo().window(towindows.get(0)); 
		 //Click on the Merge button.
		 driver.findElement(By.linkText("Merge")).click();
		 //WebElement button=driver.findElement(By.linkText("Merge"));
		 //driver.executeScript("argument[0].click()",button);
		 //Accept the alert.
		 Alert alert=driver.switchTo().alert();
	     alert.accept();
		 //Verify the title of the page.
	     System.out.println(driver.getTitle());
	   //table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)

	}

}
