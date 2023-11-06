class Overloading
{
	void add(int a, int b)
	{
		int z = a+b;
		System.out.println("Sum = "+z);
	}
	void add(int a, int b, int c)
	{
		int z = a+b+c;
		System.out.println("Sum = "+z);
	}
	void add(int a, int b, int c, int d)
	{
		int z = a+b+c+d;
		System.out.println("Sum = "+z);
	}
	public static void main(String arg[])
	{
		Overloading o = new Overloading();
		o.add(4,5);
		o.add(4,5,6);
		o.add(4,5,6,7);
	}
}