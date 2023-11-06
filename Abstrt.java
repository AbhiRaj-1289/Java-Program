abstract class Father
{
	abstract void fun();
	void pfather()
	{
		System.out.println("I am mr father.");
	}
}
class Son extends Father
{
	void pson()
	{
		System.out.println("I am mr. Son");
	}
	void fun()
	{
		System.out.println("Fun Completed");
	}
}
class Abstrt
{
	public static void main(String arg[])
	{
		Son  s = new Son();
		s.pfather();
		s.fun();
		s.pson();
	}
}

