import java.util.*;
class Pattern1 
{
    public static void main(String arg[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n;
            System.out.print("Enter No. of Rows : ");
            n = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
