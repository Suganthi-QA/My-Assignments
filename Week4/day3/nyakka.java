package Week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nyakka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brand=driver.findElement(By.xpath("//*[text()='brands']"));
		Actions action=new Actions(driver);
        action.moveToElement(brand).perform();
        //Click on "L'Oreal Paris".
        WebElement moveto=driver.findElement(By.xpath("//div[@class='brandsSorting']/li[11]/a"));
        WebElement clickbrand=driver.findElement(By.xpath("(//a[contains(@href,'loreal-paris')])[1]"));
        action.moveToElement(moveto).click(clickbrand).perform();
        
        
	}

}
