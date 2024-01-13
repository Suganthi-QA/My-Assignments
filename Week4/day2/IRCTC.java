package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> childWindow=driver.getWindowHandles();
		List<String> flightwindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(flightwindow.get(1));
		System.out.println("Title of the flight window is :"+ driver.getTitle());
		driver.switchTo().window(flightwindow.get(0));
		
		
		
	}

}
