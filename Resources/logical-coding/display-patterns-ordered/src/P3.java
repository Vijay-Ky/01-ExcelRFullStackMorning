/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
*/

class P3
{
	public static void main(String[] args) 
	{
		for(int rows = 1; rows <= 5; rows++)
		{
			for(int cols = 1; cols <= 5; cols++)
			{
				System.out.print(cols + " ");
			}
			System.out.println();
		}
	}
}
