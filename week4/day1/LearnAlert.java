package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		Alert alert = driver.switchTo().alert();
				alert.sendKeys("Ni");
				alert.accept();
		String userEnteredName = driver.findElement(By.xpath("//span[text()='User entered name as: Ni']")).getText();
				System.out.println(userEnteredName);
				
	}

	private static String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
