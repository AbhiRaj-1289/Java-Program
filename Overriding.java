class A
{
	public void example()
	{
		System.out.println("Example of A");
	}
}
class B extends A
{
	public void example()
	{
		System.out.println("Example of B");
	}
}
class Overriding
{	
	public static void main(String arg[])
	{
		B b = new B();
		b.example();
	}
}
