package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class CreateLead2 extends BaseClass {

	@Test(dataProvider = "sendData")
	public void runCreate(String cName, String fname, String lname) {
		System.out.println(Thread.currentThread().getId());

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider
	public void sendData() throws IOException
	{
		
		//String[][] data = new String[2][3];

		//data[0][0] = "Testleaf";
		//data[0][1] = "Hari";
		//data[0][2] = "R";

		//data[1][0] = "Testleaf";
		//data[1][1] = "Vidya";
		//data[1][2] = "R";

		//return ExcelIntegration.readData();
	}

}




