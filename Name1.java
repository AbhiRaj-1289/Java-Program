interface Identifier
{
	void bhoomi();
	void priyam();
}
class Name1 implements Identifier
{
	public void bhoomi()
	{
		System.out.println("Hello, I am Bhoomi Priya");
	}
	public void priyam()
	{
		System.out.println("Hello, I am Priyam Bharti");
	}
	public void abhinav()
	{
		System.out.println("Helllo,  I am Abhinav Raj");
	}
	public static void main(String arg[])
	{
		Name1 n = new Name1();
		n.bhoomi();
		n.priyam();
		n.abhinav();
	}
}