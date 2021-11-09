package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://leaftaps.com/opentaps");
         driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.className("crmsfa")).click();
         driver.findElement(By.linkText("Create Lead")).click();
         // driver.findElement(By.xpath("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
         driver.findElement(By.className("smallSubmit")).click();
         Thread.sleep(2000);
         //driver.findElement(By.linkText("Delete")).click();

         WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select mc= new Select(market);
         mc.selectByIndex(1);
         
         
         /*WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select mc= new Select(market);
         mc.selectByIndex(1);
         */
         		        
	}

}
