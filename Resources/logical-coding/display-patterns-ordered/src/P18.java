/*

A A A A A
B B B B
C C C
D D
E


*/

class P18
{
	public static void main(String[] args) 
	{
		char rows = 'E';
		for(char i = 'A'; i <= rows; i++)
		{
			for(char j = 'A'; j <= (rows + 'A' - i); j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
