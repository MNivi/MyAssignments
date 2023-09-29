package week2.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		ChromeDriver dd2= new ChromeDriver();
		dd2.get("https://www.nykaa.com/");
		dd2.manage().window().maximize();
		dd2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//String ig=dd2.getTitle();
		//System.out.println(ig);
		System.out.println(dd2.getTitle());
		dd2.close();
		
	}

}
