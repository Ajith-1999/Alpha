package firstday;

public class StarRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows , columns ,numberofrows=8;
		for(rows=0;rows<numberofrows;rows++)
		{
			
			for(columns=0;columns<=rows;columns++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
