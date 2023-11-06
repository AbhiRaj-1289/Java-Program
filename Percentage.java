import java.util.Scanner;
class Percentage 
{
    public static void main(String[] args) 
    {
        int sum, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in maths");
        int maths = sc.nextInt();
        System.out.println("enter marks in hindi");
        int hindi = sc.nextInt();
        System.out.println("enter marks in gk");
        int gk = sc.nextInt();
        sum = maths+hindi+gk;
        System.out.println("sum ="+sum);
        per = sum/300;
        System.out.println("Percentage =" +per);    
    }
}