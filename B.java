class A
{
	int x = 5;
}
class B extends A
{
	int x = 20;
	void show()
	{
		System.out.println("X = "+x);
		System.out.println(super.x);
	}
	public static void main(String arg[])
	{
		B b = new B();
		b.show();
	}
}



	