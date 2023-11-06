import java.util.*;
class Comparison
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fisrt Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		if(a > b)
			System.out.println("A is the Greatest");
		else
			System.out.println("B is the Greatest");
	}
}
