import java.util.Scanner;
class Mensuration
{
	public static void main(String arg[])
	{
		int l,b,h;
		double sa,v;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		b =  sc.nextInt();
		System.out.println("Enter Height: ");
		h = sc.nextInt();
		sa = 2*((l*b)+(b*h)+(l*h));
		v = l*b*h;
		System.out.println("Volume ="+v);
		System.out.println("Surface Area ="+sa);
	}
}