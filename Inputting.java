import java.util.Scanner;
class Inputting
{
	static void input()
	{
		Scanner sc = null;
		int x = 0;
		String s =  null;
		try	
		{
			sc = new Scanner(System.in);
			System.out.println("Enter a String");	
			s = sc.nextLine();
			System.out.println("Enter a number");
			x = sc.nextInt();
			System.out.println("You Have Entered: ");
			System.out.println("String = "+s);
			System.out.println("Number = "+x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String arg[])
	{
		input();
	}
}