package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Enter the First name.
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Suga");
		//Enter the Surname
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input")).sendKeys("Chandrababu");
		//Enter the Mobile number or email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("suga@gmail.com");
		//Enter the New password
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input")).sendKeys("0000");
		//Handle all three dropdowns in Date of birth
		WebElement dayas=driver.findElement(By.xpath("//span/select"));
		Select day=new Select(dayas);
		day.selectByIndex(1);
		WebElement monthas=driver.findElement(By.xpath("//span/select[2]"));
		Select month=new Select(monthas);
		month.selectByIndex(1);
		WebElement yearas=driver.findElement(By.xpath("//span/select[3]"));
		Select year=new Select(yearas);
		year.selectByIndex(1);
		
	    //Select the radio button in Gender.
		WebElement radio=driver.findElement(By.xpath("//span[@class='_5k_3']//span[1]"));
		radio.click();

	}

}
