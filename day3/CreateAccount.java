package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         //intitalize the chrome driver
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get( "http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//maximize the window
		driver.manage().window().maximize();
		//enter username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
	    //Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" b
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("rishi");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	    // Select "ComputerSoftware" as the industry.
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select industryvalue=new Select(industry);
		industryvalue.selectByValue("IND_SOFTWARE");
		// Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipAs=new Select(ownership);
		ownershipAs.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue.
		WebElement source=driver.findElement(By.xpath("//*[@id='dataSourceId']"));
		Select sourceemp=new Select(source);
	    sourceemp.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement campaign=driver.findElement(By.xpath("//*[@id='marketingCampaignId']"));
		Select campaignAs=new Select(campaign);
		campaignAs.selectByIndex(5);
		//Thread.sleep(1000);
		//Select "Texas" as the state/province using SelectByValue.
		WebElement state=driver.findElement(By.xpath("//*[@id='generalStateProvinceGeoId']"));
		
		Select stateAs=new Select(state);
		stateAs.selectByValue("TX");
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Verify that the account name is displayed correctly
		String name=driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
	    String result=name.replaceAll("[^[a-zA-Z]]","");
	    
	    if(result.equalsIgnoreCase("rishi"))
	    {
	    	System.out.println("Name Verified successfully"+result);
	    }
	    else
	    {
	    	System.out.println("Verified Unsuccessfully"+result);
	    }
		driver.close();
	}

}
