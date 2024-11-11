/*

E E E E E
D D D D
C C C
B B
A

*/

class P22
{
	public static void main(String[] args) 
	{
		for (char i = 'E'; i >= 'A'; i--)
		{
			for (char j = 'A'; j <= i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
