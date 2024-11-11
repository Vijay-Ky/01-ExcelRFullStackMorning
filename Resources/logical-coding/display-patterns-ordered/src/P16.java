/*

1 1 1 1 1
2 2 2 2
3 3 3
4 4
5

*/

class P16
{
	public static void main(String[] args) 
	{
		int rows = 5;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= (rows + 1 - i); j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
