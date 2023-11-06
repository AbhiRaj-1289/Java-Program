interface Inf2
{
	void show();
}
class InterfaceExample implements Inf2
{
	public void show()
	{
		System.out.println("Show of Inf2");
	}
	public void sum()
	{
		System.out.println("Sum of Main");
	}
	public static void main(String arg[])
	{
		InterfaceExample ie = new InterfaceExample();
		ie.show();
		ie.sum();
	}
}