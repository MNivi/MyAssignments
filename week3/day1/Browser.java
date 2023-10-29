package week3.day1;

public class Browser {


String browserName = "Chrome";
String browserVersion = "Version 117.0.5938.132";


	@SuppressWarnings("unused")
	
	public static void openUrl()
	{
		// TODO Auto-generated method stub
		System.out.println("This is URL");
	}
	
	public static void closeBrowser()
	{
		System.out.println("Close");
		
	}
	
	public static void navigateBack()
	{
		System.out.println("Navigate Back");
	}
	public static void main(String[] args) {

		Browser br = new Browser();
		
	
}
}