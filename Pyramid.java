package firstday;

public class Pyramid {

	public static void main(String[] args)
	{
	int row, column, numberofrow=6;
	for( row=0; row<numberofrow; row++ )
	{
		for(column=numberofrow-row; column>1;column--)
		{
			System.out.print(" ");
		}
		for(column=0; column<=row; column++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

	}

}
