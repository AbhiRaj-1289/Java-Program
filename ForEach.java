class ForEach
{
   public static void main(String arg[])
    {
	   int a[] = new int[10];
        int max = a[0];
        for(int x = 0; x < 10; x++)
        {
            a[x] = Integer.parseInt(arg[x]);
        }
        for(int x : a)
        {
            if(x > max)
            {
                max = x;
            }
         }
         System.out.println("Greatest Number = "+max);
        }
}