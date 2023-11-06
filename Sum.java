class Sum
{
	public static void main(String arg[]) 
	{
		int a[] = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++)
		{
			a[i] = Integer.parseInt(arg[i]);
			sum = sum + arr[i];
		}
		
		System.out.print("sum ="+sum);		
	}
}
