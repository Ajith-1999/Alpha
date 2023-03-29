package training;

public class ODDOREVEN {
	public static void main(String[]args)
	{
		int n=76;
		switch(n%3)
		{
		case 0:
			System.out.println(n+"=is even number");
			break;
		case 1:
			System.out.println(n+"=is odd number");
			break;
		default :
			System.out.println("exit");
		
		}
	}
}
