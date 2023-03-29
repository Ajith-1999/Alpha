package firstday;

import java.util.Scanner;

public class TriangleStarPattern {

	public static void main(String[] args) {
		{
		    int numberOfRows;
		    System.out.println("Enter number of rows: ");
		    Scanner scan=new Scanner(System.in);
		    numberOfRows = scan.nextInt();
		    for (int i = numberOfRows-1; i >= 0; i--) {
		      for (int j = 0; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}
	}

