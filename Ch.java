//import java.util.*;
class Same
{
    String s1;
    String s2;
    Same(String x, String y)
    {
        s1 = x;
        s2 = y;
    }
    void match()
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
}
class Ch
{
    public static void main(String arg[])
    {
        //try (Scanner sc = new Scanner(System.in))
        //{
            String x,y;
            //System.out.println("Input Two Strings");
            x = arg[0];
            y = arg[1];
            Same s = new Same(x, y);
            s.match();
        //}
    }
}