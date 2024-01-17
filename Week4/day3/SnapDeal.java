package Week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(80));
		//Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		Actions action=new Actions(driver);
		//Go to "Men's Fashion".(mouse hover)
		WebElement mensfashion=driver.findElement(By.linkText("Men's Fashion"));
		action.moveToElement(mensfashion).perform();
		// Go to "Sports Shoes".
		WebElement sports=driver.findElement(By.linkText("Sports Shoes"));
		//action.moveToElement(sports).perform();
		action.doubleClick(sports).perform();
		//driver.findElement(By.linkText("Sports Shoes")).click();
		//Get the count of sports shoes.
		WebElement coutofshoes=driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		coutofshoes.click();
		System.out.println("Total count of sports shoes are "+coutofshoes.getText());
		
		//Click on "Training Shoes".
		WebElement trainingshoe=driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		action.click(trainingshoe).perform();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		//Sort the products by "Low to High
		//WebElement Clicksort=driver.findElement(By.xpath("//div[@class='sort-drop clearfix']"));
		//WebElement Clickselect=driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]"));
		//action.scrollToElement(Clicksort).click(Clicksort).moveToElement(Clickselect).click(Clickselect).perform();
		//Check if the displayed items are sorted correctly
		//Select any price range ex:(500-700)
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		WebElement tovalue=driver.findElement(By.xpath("//input[@name='toVal']"));
		action.moveToElement(tovalue).click(tovalue).sendKeys("700").keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
		Thread.sleep(3000);
		
		///driver.findElement(By.xpath("//input[@id='Color_s-Black']")).click();
		WebElement color=driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		//driver.executeScript("argument[0].click();",color);
		//WebElement color=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Color_s-Black']")));
		//color.click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Color_s-Black']"))).click();
	  action.scrollToElement(color).click(color).perform();
	  Thread.sleep(2000);
	  //Mouse hover on the first resulting "Training Shoes
	  WebElement hover=driver.findElement(By.xpath("//*[@class='picture-elem']"));
	  action.contextClick().perform();
	  WebElement quickview=driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div"));
	  action.click(quickview).perform();
	 // Print the cost and the discount percentage.
	  WebElement cost=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]"));
	  WebElement discount=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]"));
	  System.out.println("Cost of the product is :"+cost.getText());
	  System.out.println("Discount is "+discount.getText());
	  //Take a snapshot of the shoes.
	  File sourcefile=driver.getScreenshotAs(OutputType.FILE);
	 File destination=new File("./Screenshot/productscreenshot.png");
	 FileUtils.copyFile(sourcefile, destination);
    
			
	}

}
