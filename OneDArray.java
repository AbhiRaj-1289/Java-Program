class OneDArray 
{
	public static void main(String arg[]) 
	{
		int a[] = {3,4,10,20,50};
		int arr[] = new int[5];
		for(int i = 0; i < 5; i++)
		{
			arr[i] = Integer.parseInt(arg[i]);
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.print(arr[i]+" "+a[i]);
		}
	}
}
