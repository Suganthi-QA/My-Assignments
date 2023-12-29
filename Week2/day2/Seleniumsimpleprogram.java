package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsimpleprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/login");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.close();
	}

}
