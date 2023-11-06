interface InterfaceEx
{
	public void show();
	public void display();
}
class Ex implements InterfaceEx
{
	public void show()
	{
		System.out.println("This is Show");
	}
	public void display()
	{
		System.out.println("This is Display");
	}
	public static void main(String arg[])
	{
		Ex e = new Ex();
		e.show();
		e.display();
	}
}
