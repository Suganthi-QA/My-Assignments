package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click the "Try It" button inside the frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click OK/Cancel in the alert that appears
		Alert a=driver.switchTo().alert();
		a.sendKeys("Suganthi");
		//System.out.println("Text displayed as :"+a.getText());
		a.accept();
		//Confirm the action is performed correctly by verifying the text displayed
		String getname=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(getname.contains("Suganthi"))
		{
			System.out.println("Displayed message is verified successfully");
		}
		else
		{
			System.out.println("Displayed message is verified Unsuccessfully");
			
		}
		
		
		
	}

}
