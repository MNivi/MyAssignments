package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHan {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='flight']//span[1]")).click();
		String childWin = driver.getWindowHandle();
		System.out.println(childWin);
		Set<String> winHan=driver.getWindowHandles();
		
		
		List<String> winHan1= new ArrayList<String>(winHan);
		driver.switchTo().window(winHan1.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(winHan1.get(0));
		driver.close();

	}


}
