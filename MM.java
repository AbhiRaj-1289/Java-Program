class MM 
{
	public static void main(String arg[]) 
	{
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int j = 0, k = 0;
		int result[][] = new int[3][3];
		System.out.print("The First Matrix : ");
		for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < 3; c++)
			{
				a[r][c] = Integer.parseInt(arg[j]);
				j++;
			}
		}
		System.out.print("Enter 2nd Matrix : ");
		for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < 3; c++)
			{
				b[r][c] = Integer.parseInt(arg[k]);
				k++;
			}
		}
		System.out.print("Result Matrix : ");
		for(int r = 0; r < 3; r++)
		{
			for(int c = 0; c < 3; c++)
			{
				result[r][c] = 0;
				for(int l = 0; l < 3; l++)
				{
					result[r][c]+=a[r][k]*b[k][c];
				}
				System.out.print(result[r][c]+" ");
			}
			System.out.println();
		}
		
	}
}
