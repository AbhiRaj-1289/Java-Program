class Father
{
	void pfather()
	{
		System.out.println("I am Mr. Father");
	}
}
class Son extends Father
{
	void pson()
	{
		System.out.println("I am Mr. Son");
	}
}
class Daughter extends Father
{
	void pdaughter()
	{
		System.out.println("I am Ms. Daughter");
	}
}
 class HI
{
	public static void main(String arg[])
	{
		Son s = new Son();
		Daughter d = new Daughter();
		s.pfather();
		d.pfather();
	}
}
