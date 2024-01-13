package Week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.amazon.com/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys" + Keys.ENTER);
	      String text=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
	      System.out.println(text);
	   //   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
	     WebElement brandone= driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]"));
	     driver.executeScript("arguments[0].click();",brandone);   
	     WebElement brandtwo= driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]"));
	     driver.executeScript("arguments[0].click();",brandtwo);   
	    
	    // driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base a-text-bold'])[3]")).click();
	     // driver.findElement(By.xpath("(//span[@data-action='sf-select-refinement-picker'])[5]/span[6]")).click();
	      WebElement sortby=driver.findElement(By.id("s-result-sort-select"));
	      Select sortbynew=new Select(sortby);
	      sortbynew.selectByVisibleText("Newest Arrivals");
	      
	      
	      String bagname= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
	     // System.out.println("Brand names are :"+brandone.getText() +","+brandtwo.getText());
	     System.out.println(bagname);
	}

}
