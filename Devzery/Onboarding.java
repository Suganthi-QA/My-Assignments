package Devzery;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Onboarding {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://app.devzery.com/signup");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Provide the name
        driver.findElement(By.id("name")).sendKeys("Nani");
        //provide the email
        driver.findElement(By.id("email")).sendKeys("nani@gmail.com");
        //provide the password
        driver.findElement(By.id("password")).sendKeys("Mahi123");
        //click the button
        driver.findElement(By.xpath("//button[@class='bubble-element Button cmaUaTb0']")).click();
        
        System.out.println(driver.findElement(By.xpath("//div[@class='bubble-element Text cmaSaHaY bubble-r-vertical-center']//div")).getText());
        //Set<String> childWindow=driver.getWindowHandles();
		//List<String> flightwindow=new ArrayList<String>(childWindow);
		//driver.switchTo().window(flightwindow.get(1));
        //Provide the organization name
        driver.findElement(By.xpath("//*[@placeholder='Organization Name']")).sendKeys("TCS");
      //Select the industry
        WebElement selectorgan=driver.findElement(By.xpath("//div[@class='bubble-element Group cmaUaWz0 bubble-r-container flex column']//select"));
        Select organisation=new Select(selectorgan);
        organisation.selectByIndex(2);
        //Select the role
        WebElement role=driver.findElement(By.xpath("//div[@class='bubble-element Group cmaUaXaL0 bubble-r-container flex column']//select"));
        Select roleAs=new Select(role);
        roleAs.selectByIndex(3);
      //Select the Team size
        WebElement Team=driver.findElement(By.xpath("//div[@class='bubble-element Group cmaUaXaW0 bubble-r-container flex column']//select"));
        Select teamSize=new Select(Team);
        teamSize.selectByIndex(5);
      //Enter the domain name
        driver.findElement(By.xpath("//*[@placeholder='www.example.com']")).sendKeys("www.tcs.com");
        //click the submit button
        driver.findElement(By.xpath("//button[@class='clickable-element bubble-element Button cmaSaNw0']")).click();
        
	}

}
