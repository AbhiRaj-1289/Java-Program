package mypack;
public class StringOperations
{
    String s1;
    String s2;
    public StringOperations(String x, String y)
    {
        s1 = x;
        s2 = y;
    }
    public void match()
    {
        
        if(s1.equals(s2))
        {
            System.out.print("Same");
        }
        else
        {
            System.out.print("Diffrent");
        }
    }
	public static void show()
	{
		System.out.println("This is A package");
	}
}
	
