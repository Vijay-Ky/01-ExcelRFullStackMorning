/*
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/

class P6
{
	public static void main(String[] args) 
	{
		for (int i = 5; i >= 1; i--)
		{
			for (char j = 'A'; j <= 'E'; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

