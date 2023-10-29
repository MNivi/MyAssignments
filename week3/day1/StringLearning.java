package week3.day1;

public class StringLearning {

	public static void main(String[] args) {
	
		
		
		String name= "Test Leaf";
		char expectedCharacter='e';
		int count=0;
		for(int i=0;i<name.length()-1;i++)
		{
			if(name.charAt(i)==expectedCharacter)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
