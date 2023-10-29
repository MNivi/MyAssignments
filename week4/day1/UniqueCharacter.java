package week4.day1;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String str="google";

		Set<Character> uniqueCharacters = new HashSet<Character>();
	for (char ch: str.toCharArray()) {
		uniqueCharacters.add(ch);
		}
		
		for (char ch: uniqueCharacters)
		{
			System.out.println(ch);
		}
	}

}



