import java.util.*;
public class Bill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int small = 100, medium = 150, large = 200, result = 0;
        char size, cheese;
        System.out.println("Welcome to Pizza Bill calculator");
        System.out.println("Enter The Size of your pizza : ");
        size = sc.next().charAt(1);
        if(size == 's' || size == 'S')
        {
            System.out.println("Do you want cheese (y/n): ");
            cheese = sc.next().charAt(1);
            if(cheese == 'y' || cheese == 'Y')
            {
                result =  small + 10;
                System.out.println("Your Bill is = "+result);
            }
            else
            {
                System.out.println("Your bill is = "+small);
            }
        }
        else if(size == 'm' || size == 'M')
        {
            System.out.println("Do you want cheese (y/n): ");
            cheese = sc.next().charAt(1);
            if(cheese == 'y' || cheese == 'Y')
            {
                result =  medium + 10;
                System.out.println("Your Bill is = "+result);
            }
            else
            {
                System.out.println("Your bill is = "+medium);
            }
        }
        else if(size == 'L' || size == 'l')
        {
            System.out.println("Do you want cheese (y/n): ");
            cheese = sc.next().charAt(1);
            if(cheese == 'y' || cheese == 'Y')
            {
                result =  large + 10;
                System.out.println("Your Bill is = "+result);
            }
            else
            {
                System.out.println("Your bill is = "+large);
            }
        }
    }    
}
