import java.util.*;
class Check
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number:");
		int x = sc.nextInt();
		if(x % 2 == 0)
			System.out.println("Number  is Even");
		else
			System.out.println("Number is Odd");
	}
}