package training;

public class programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int n=5;
		int i;
		int fact=1;
		for(i=1;i<=n;i++)
		{
			fact*=i;
			System.out.println("Factorial of 5="+fact);
		}*/
		int f1=0,f2=1,f3=2,f4;
		{
			System.out.println(f1);
			System.out.println(""+f2);
			for(int i=0;i<=50;i++)
			{
				f3=f1+f2;
				System.out.println(""+f3);
				f1=f2;
				f2=f3;
			}
		}
	}

}
