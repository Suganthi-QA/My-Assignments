package Week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.pvrcinemas.com/");
	     
	      driver.findElement(By.xpath("//*[@id='locationsearch']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//a[@class='thumnail clearfix']/span)[4]")).click();
	      driver.findElement(By.xpath("//*[@class='icon-bar icon'][3]")).click();
	      driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
	      //select the genre
	      WebElement selectgenre= driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted']/select)[1]"));
	      Select genre=new Select(selectgenre);
	      genre.selectByVisibleText("ANIMATION");
	      //select the language
	      WebElement selectlanguage= driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted'])[2]/select"));
	      Select selectlanguageAs=new Select(selectlanguage);
	      selectlanguageAs.selectByVisibleText("ENGLISH");
	      driver.findElement(By.xpath("//button[text()='Apply']")).click();
	      Thread.sleep(3000);
	     WebElement webElement=driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']/div)[1]"));
	     //Javascript code for click function
	     driver.executeScript("arguments[0].click();", webElement);   
	     driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	     //Select cinema
	     WebElement selectcinema= driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/select)[1]"));
	      Select cinema=new Select(selectcinema);
	      cinema.selectByValue("INOX The Marina Mall, OMR, Chennai");
	      //show time 
	      WebElement selectshow= driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/select)[2]"));
	      Select showtime=new Select(selectshow);
	      showtime.selectByValue("09:00 AM - 12:00 PM");
	      driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090989898");
	      driver.findElement(By.xpath("//*[@id='datepicker-input']")).click();
	      driver.findElement(By.xpath("//*[@class='day-unit ng-star-inserted']")).click();
	      driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
	      driver.findElement(By.xpath("//input[@name='name']")).sendKeys("suganthi");
	      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suganthi@gmail.com");
	      //F&B Requirements
	      WebElement requirement= driver.findElement(By.xpath("(//*[@class='form-group col-sm-6 input-list']/select)[3]"));
	      Select requirementAS=new Select(requirement);
	      requirementAS.selectByValue("Yes");
	     driver.findElement(By.xpath("//*[@name='comment']")).sendKeys("NA");
	      WebElement copy=driver.findElement(By.xpath("//*[@id='copySelf']"));
	      driver.executeScript("arguments[0].click()",copy);
	      driver.findElement(By.xpath("//*[text()='SEND REQUEST']")).click();
	     driver.findElement(By.xpath("(//*[text()='CANCEL'])[2]")).click();
	     driver.findElement(By.xpath("//*[@class='swal2-close']")).click();
	     if( driver.getTitle().equalsIgnoreCase("Movie Library"))
	     {
	    	 System.out.println("Title verified"+ driver.getTitle());
	     }
	     else
	     {
	    	 System.out.println("Title verification is unsuccessful"+ driver.getTitle());
	     }
	     driver.close();
	}

}
