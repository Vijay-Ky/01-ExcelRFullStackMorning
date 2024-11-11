/*

E D C B A
E D C B
E D C
E D
E

*/

class P23
{
    public static void main(String[] args)
	{
        char rows = 'E';
        for (char i = 'A'; i <= rows; i++)
		{
            for (char j = rows; j >= i; j--)
			{
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
