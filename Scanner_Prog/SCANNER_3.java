package scanner;

import java.util.Scanner;

public class sw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int c=sc.nextInt();
		switch(c)
		{
		case 1,3,5,7,8,10,12: {
			System.out.println("31 days");
			break;
		}
		case 4,6,9,11: {
			System.out.println("28 or 29 days");
			break;
		}
		case 2:{
			System.out.println("30 days");
			break;
		}

	}

	}
	
}
