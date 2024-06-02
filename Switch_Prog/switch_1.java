package scanner;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int c=sc.nextInt();
		switch(c)
		{
		case 8:
		case 15:
		case 22:
		case 29:
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 9:
		case 16:
		case 23:
		case 30:
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 10:
		case 17:
		case 24:
		case 31:
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 11:
		case 18:
		case 25:
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 12:
		case 19:
		case 26:
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 13:
		case 20:
		case 27:
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 14:
		case 21:
		case 28:
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default :
			System.out.println("no day exist");
		
		}

	}

}
