package Week4.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://snapdeal.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("Phone" + Keys.ENTER);
	 
	 List<WebElement> phoneprice=driver.findElements(By.xpath("//span[@class='lfloat product-price\']"));
     List<Integer> price=new LinkedList<Integer>();
     
	}

}
