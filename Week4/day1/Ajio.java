package Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.ajio.com/");
     driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags"+ Keys.ENTER);
	 driver.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[2]")).click();
	 //Under "Category" click "Fashion Bags"
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	 // Print the count of the items found.
	 Thread.sleep(3000);
	 System.out.println(driver.findElement(By.xpath("//div[@class='length']/strong")).getText());
	 //Get the list of brand of the products displayed in the page and print the list.
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[text()='brands']")).click();
	 //System.out.println(brandlist.getText());
	//WebElement clickbrand= driver.findElement(By.xpath("(//div[text()='Select All'])[4]"));
	//clickbrand.click();
	List<WebElement> brand=new ArrayList<WebElement>(driver.findElements(By.xpath("(//div[@class='facet-body'])[3]//input")));
	brand.size();
	System.out.println(brand.size());
	for(int i=0;i<brand.size();i++)
	{
	System.out.println(brand.get(i).getAttribute("value"));
	}
	System.out.println("***************************************************");
	System.out.println("Brand name list");
	 //Get the list of names of the bags and print it
	List<WebElement> brandname=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='brand']")));
	brand.size();
	System.out.println(brandname.size());
	for(int i=0;i<brandname.size();i++)
	{
	System.out.println(brandname.get(i).getAttribute("aria-label"));
	}
	 
	}

}
