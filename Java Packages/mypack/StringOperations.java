package mypack;
public class StringOperations
{
	String s1;
	String s2;
	public void match(String x, String y)
	{
		s1 = x;
		s2 = y;	
		if(s1.equals(s2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Diffrent");
		}
	}
	public void changeupper(String s)
	{
		s1 = s;
		System.out.println(s1.toUpperCase());
	}
	public void changelower(String i)
	{
		s1 = i;
		System.out.println(s1.toLowerCase());
	}
	public void concatenate(String k, String o)
	{
		s1 = k;
		s2 = o;
		System.out.println(s1+s2);
	}
}