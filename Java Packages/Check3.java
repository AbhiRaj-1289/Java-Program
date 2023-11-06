import mypack.*;
import java.util.Scanner;
class Check3
{
	public static void main(String args[])
	{
		String x,y;
		try (Scanner sc = new Scanner(System.in)) {
			StringOperations m = new StringOperations();
			System.out.println("Enter Two Strings :");
			x = sc.nextLine();
			y = sc.nextLine();
			m.match(x,y);
			System.out.println("Enter String To Change In Uppercase :");
			x = sc.nextLine();
			m.changeupper(x);
		}
	}
}