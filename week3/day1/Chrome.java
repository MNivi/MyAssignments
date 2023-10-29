package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("open incognito");
	}
	
	public void clearCache()
	{
		System.out.println("clear the cache");
	}

	public static void main(String[] args) {
Chrome chr=new Chrome();
       chr.openUrl();
       chr.clearCache();


	}

}
