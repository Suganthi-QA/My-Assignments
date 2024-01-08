package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Launch the Browser and Load the URL https://www.leafground.com/radio.xhtml.
		driver.get("https://www.leafground.com/radio.xhtml");
		 //Add the ImplicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Maximize the browser window.
		driver.manage().window().maximize();
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		//Click on a radio button, then click on the same radio button again to
		//verify that it becomes ‘unselected’.
		WebElement select=driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
		select.click();
		Boolean selectAs=select.isSelected();
		System.out.println("Selected is "+selectAs);
		if(selectAs==false)
		{
			select.click();
		}
		// Identify the radio button that is initially selected by default.
		String selectedName=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
		System.out.println("Default Selected radio button  is "+selectedName);
		// Check and select the age group (21-40 Years) if not already selected.
		Boolean selectedage=driver.findElement(By.xpath("//input[@name='j_idt87:age']")).isSelected();
		System.out.println("Selected age is "+selectedage);
		if(selectedage==false)
		{
			driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
		}
	}

}
