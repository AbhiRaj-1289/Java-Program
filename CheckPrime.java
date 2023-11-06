import java.util.*;
class CheckPrime
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int x = sc.nextInt();
		a = 1;
		b = 0;
		while(a <= x)
		{
			if(x % a == 0)
				b = b+1;
				a++;
		}
		if (b == 2)
			System.out.println("Given Number is A Prime Number");
		else
			System.out.println("Given Number is Not A Prime Number");
	}
}