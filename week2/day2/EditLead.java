package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nivethax");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	String title= "View Lead";
	String title1= driver.getTitle();
	if(title.equalsIgnoreCase(title1)) {
		System.out.println("Title matches");
	}
	else
	{
		System.out.println("Title not matches");
	}
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(2000);
    driver.findElement(By.name("companyName")).click();
    driver.findElement(By.name("companyName")).clear();
    driver.findElement(By.name("companyName")).sendKeys("MO");
    driver.findElement(By.name("submitButton")).click();
boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
System.out.println("displayed");
driver.close();
	
	}

}
