package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		String text =crm.getText();
		System.out.println(text);
		crm.click();
		WebElement logout = driver.findElement(By.className("linktext"));
	    System.out.println(logout.getAttribute("class"));
		
		

	}

}
