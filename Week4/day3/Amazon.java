package Week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox" )).sendKeys("oneplus 9 pro" + Keys.ENTER);
		//Get the price of the first product
		System.out.println("Cost of the first product" +driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText());
		//Print the number of customer ratings for the first displayed product.
		System.out.println("Ratings of the  product" +driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]//span")).getText());
		//Click the first text link of the first image.
		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini a-spacing')])[1]")).click();
		Set<String> window=driver.getWindowHandles();
		List<String> getwind=new ArrayList<String>(window);
		driver.switchTo().window(getwind.get(1));
		
		//Take a screenshot of the product displayed.
		File source=driver.getScreenshotAs(OutputType.FILE);
		File designation=new File("/screenshot/onephone.jpg");
		FileUtils.copyFile(source, designation);
		//Click the 'Add to Cart' button.
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Get the cart subtotal and verify if it is correct
		WebElement total=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		Set<String> newwindow=driver.getWindowHandles();
		List<String> getwinds=new ArrayList<String>(newwindow);
		driver.switchTo().window(getwinds.get(1));
		System.out.println("Subtotal is " + total.getText());
	}

}
