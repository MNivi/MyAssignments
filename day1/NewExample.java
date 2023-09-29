package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewExample {

	public static void main(String[] args) {

				ChromeDriver driver=new ChromeDriver(); 
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Movate");
				driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("nivethamohan");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nivetha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
				WebElement username = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd = new Select(username);
				dd.selectByIndex(4);
				WebElement username1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select dd1 = new Select(username1);
				dd1.selectByVisibleText("Automobile");
				WebElement username2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select dd2 = new Select(username2);
				dd2.selectByValue("OWN_CCORP");
				driver.findElement(By.name("submitButton")).click();
				System.out.println(driver.getTitle());
				driver.close();
			}

	}
