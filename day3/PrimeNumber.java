package week1.day3;

public class PrimeNumber {

	public static void main(String[] args) {
int a=6;
boolean flag = true;
for(int i = 3; i<a; i++)
{
	if (a%i==0)
	{
		flag=false;
	}
}
if (flag)
{
	System.out.println("it is prime");
	}
else
{
	System.out.println("it is not prime");

}

}
}
