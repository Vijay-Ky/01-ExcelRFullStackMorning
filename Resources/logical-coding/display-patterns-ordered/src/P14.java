/*

A
A B
A B C
A B C D
A B D C E

*/

class P14
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'E'; i++)
		{
			for (char j = 'A'; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
