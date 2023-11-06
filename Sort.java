class Sort 
{
	public static void main(String arg[]) 
	{
		int a[] = new int[5];
		int temp;
		for(int i = 0; i < 5; i++)
		{
			a[i] = Integer.parseInt(arg[i]);
		}
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 5; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Assending Order :");
		for(int i = 0; i < 4 ; i++)
			{
				System.out.print(a[i]+ ",");
			}
			System.out.print(a[4]);
	}
}
	

