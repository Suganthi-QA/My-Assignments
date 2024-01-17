package Week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionExecise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions scroll=new Actions(driver);
		WebElement name=driver.findElement(By.xpath("//*[text()='Conditions of Use']"));
		scroll.scrollToElement(name).perform();
		System.out.println(name.getText());
		//Snapshot
		File sourcefile=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshot/image01.png");
		FileUtils.copyFile(sourcefile, destination);
		
		
	}

}
