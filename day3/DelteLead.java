package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		  //Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		 // 4. Click on CRM/SFA Link 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//5. Click on Leads Button 
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter CompanyName Field Using id Locator 
		// Enter FirstName Field Using id
		 // Locator 9. Enter LastName Field Using id Locator 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rakeshs");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		 // Enter FirstName(Local)Field Using id Locator 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kumars");
		//Enter Department Field Using any Locator of YourChoice 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		 // Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to testleaf");
		 // your email in the E-mail address Field using the locator of your choice 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suga@gmail.com");
		 // Click on Create Button 
		driver.findElement(By.name("submitButton")).click();
		//Get the Title of Resulting Page using driver.getTitle() 
		System.out.println(driver.getTitle());
		 //Click on Duplicate button 
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Clear the CompanyName Field using .clear()
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		// And Enter new CompanyName 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RVS");
		//18.Clear the FirstName Field using .clear() And Enter new FirstName Bu
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mahi");
		
		 //19.Click on Create Lead Button
		 //Get the Title of Resulting Page using driver.getTitle
		System.out.println(driver.getTitle());
		 
	}

}
