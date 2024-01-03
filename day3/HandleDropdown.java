package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intialize the chrome driver
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Leads tab.
		driver.findElement(By.linkText("Leads")).click();
		// Click on the Create Lead link from shortcuts.
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the mandatory fields on the web page.
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Peerbits");
		//using xpath by attributes
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		//using xpath by partial  attributes
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')")).sendKeys("Nithin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		// Select Employee in the source dropdown (using index)
		WebElement source =driver.findElement(By.name("dataSourceId"));
		Select sourceAs=new Select(source);
		sourceAs.selectByValue("LEAD_EMPLOYEE");
		
		//Select Automobile in the Marketing Campaign (using visibleText)
		WebElement marketing=driver.findElement(By.name("marketingCampaignId"));
		Select marketingAs=new Select(marketing);
		marketingAs.selectByVisibleText("Automobile");
		// Select Corporation in Ownership (using value)
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipAs=new Select(ownership);
		ownershipAs.selectByValue("OWN_CCORP");
		// Click on the Create Lead button.
		driver.findElement(By.name("submitButton")).click();
		// Verify the title of the current web page
		

	}

}
