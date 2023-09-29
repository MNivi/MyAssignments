package week1.day2;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,5,7,7,5,9,2,3};
		int a=num.length;
		for (int i = 0; i< a; i++) 
		{
			for (int j=i+1; j<a; j++)
			{
				if(num[i]==num[j])
					System.out.println(num[j]);
			}
		}

	}

}
