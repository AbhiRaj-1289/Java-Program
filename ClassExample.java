import java.util.*;
class  A
{
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
}
class ClassExample
{
    public static void main(String arg[])
    {
        A a = new A();
        System.out.print("The Inputted String = ");
        System.out.println(a.s);
    }
}