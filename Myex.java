class Myex 
{
	public static void main(String arg[])
	{	
		int a,b,c;
		try
		{
			a = Integer.parseInt(arg[0]);
			b = Integer.parseInt(arg[1]);
			c = a/b;
			System.out.println("Result = "+c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Only numbers are allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Parameter Mising");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero is not allowed");
		}
		finally
		{
			System.out.println("This Program has passed through Exception");
}
}
}