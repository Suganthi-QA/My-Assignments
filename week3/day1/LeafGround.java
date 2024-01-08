package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://leafground.com/button.xhtml");
		// Maximize the browser window.
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']"));
		// Verify that the title of the page is ‘dashboard.’
		driver.getTitle();
		if(driver.getTitle().contains("dashboard"))
		{
			System.out.println("Title verified successfully");
		}
		else
		{
			System.out.println("Title verification Unsuccessfully");
		}
		// Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement button=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean buttonconfirm=button.isEnabled();
		if(buttonconfirm==true)
		{
			System.out.println("Button Enabled");
		}
		else
		{
			System.out.println("Button Disabled");
		}
		driver.get("https://leafground.com/button.xhtml");
		// Find and print the position of the button with the text ‘Submit.’
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']//span[2]")).getText());
		// Find and print the background color of the button with the text ‘Find the Save button color.’
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getLocation());
		// Find and print the height and width of the button with the text ‘Find the height and width of this button
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']//span[2]")).getSize());
	}

}
