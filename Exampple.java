class Example
{
	public static void main(String arg[])
	{
		int a,b,d;
		try
		{
			a = Integer.parseInt(arg[0]);
			b = Integer.parseInt(arg[1]);
			d = a/b;
			System.out.println("Result = "+d);;
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Two Parameters are Required.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero is not allowed.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Only Number Is Allowed.");
		}
	}
}