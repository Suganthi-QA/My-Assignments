package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexcercise {
	//Initialize ChromeDriver
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load the URL https://leafground.com/checkbox.xhtml
	    driver.get("https://leafground.com/checkbox.xhtml");
		
		//Maximize the browser window
       driver.manage().window().maximize();
		//Add an implicit wait to ensure the web page elements are fully loaded
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //Select basic checkbox
      // driver.findElement(By.xpath("//input[@id='j_idt87:j_idt89_input']")).click();
      driver.findElement(By.xpath("//span[text()='Basic']")).click();
      //Click on the "Notification Checkbox.
      
      String text=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']")).getAttribute("aria-checked");
      //Verify that the expected message is displayed.
      if(text.equalsIgnoreCase("false"))
      {
    	  driver.findElement(By.xpath("//span[text()='Ajax']")).click();
    	  System.out.println("Checked");
      }
      else
      {
    	  System.out.println("UnChecked");
      }
   
      //Click on your favorite language (assuming it's related to checkboxes)
      
      driver.findElement(By.cssSelector("label[for='j_idt87:basic:0']")).click();
      //Click on the "Tri-State Checkbox.
      WebElement stateAS=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]"));
    
      Boolean state=stateAS.isEnabled();
     System.out.println( "Current state is:"+state);
      
    //Verify which tri-state option has been chosen.
      if (state==false)
      {
    	  System.out.println("State is Zero");
    	  stateAS.click();
      }
      else if (state==true)
      {
    	  System.out.println("State is one");
    	  stateAS.click();
      }
      else
      {
    	  System.out.println("State is two");
      }
    //Click on the "Toggle Switch."
      driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[2]")).click();
      String textas=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).getAttribute("class");
      System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).getAttribute("class"));
    //Verify that the expected message is displayed.
      if (textas.contains("ui-toggleswitch-checked"))
      {
    	  System.out.println("Checked");
      }
      else
      {
    	  System.out.println("UnChecked");
      }
    //Verify if the Checkbox is disabled.
   
    if(driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']")).isDisplayed()==false);
    {
    	System.out.println("Checkbox is disabled");
    }
    //Select multiple options on the page (details may be needed).
    driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
     List<WebElement> multiplecheck=driver.findElements(By.cssSelector("li[class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']"));
     System.out.println("Number of checkbox"+multiplecheck.size());
     for(int i=0;i<multiplecheck.size();i++)
     {
    	String textname= multiplecheck.get(i).getAttribute("data-item-value");
    	   multiplecheck.get(i).click();
		
    
    	 System.out.println(""+textname);
    	 //if(textname.equalsIgnoreCase("miami"))
    	 //{
    	   
    	 //}
    	 
     }
     
   
      //Perform any additional actions or verifications required.
      // Close the web browser when done.
	}

}
