package Week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.abhibus.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai" );
      driver.findElement(By.xpath("//*[text()='Chennai']")).click();
      driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore" );
      driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
      driver.findElement(By.xpath("//*[text()='Tomorrow']")).click();
      driver.findElement(By.xpath("//*[text()='Search']")).click();
      WebElement busname=driver.findElement(By.xpath("//h5[@class='title']"));
      System.out.println("Title of the first result bus is "+busname.getText());
      driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
      WebElement seatavailable=driver.findElement(By.xpath("(//div[@class='text-grey'])[1]/small"));
      System.out.println("No of available seat is  "+seatavailable.getText());
      driver.findElement(By.xpath("(//*[text()='Show Seats'])[1]")).click();
      driver.findElement(By.xpath("//*[@class='seat sleeper']/span")).click();
      driver.findElement(By.xpath("(//*[@class='label'][1])/p")).click();
      driver.findElement(By.xpath("//div[@class='label']/p")).click();
      WebElement selectedseat=driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']"));
      System.out.println("Selected Seat and total fare is   "+selectedseat.getText());
      System.out.println("Title of the page is   "+driver.getTitle());
      driver.close();
      
      
	}

}
