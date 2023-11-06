class Transpose
{
	public static void main(String arg[])
	{
		int a[][] = new int[5][5];
		int k = 0;
		System.out.print("Enter elements of Array:");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(arg[k]);
				k++;
			}
		}
		System.out.print("Array Before Transposition : ");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.print("Array After Transposition : ");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
	}
}