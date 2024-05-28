package scanner;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
//		double a;
		Scanner sc = new Scanner(System.in);
//		System.out.println("enrter the value of a:");
//		a=sc.nextDouble();
//		float b;
//		b=sc.nextFloat();
//		short c;
//		c=sc.nextShort();
//		long v;
//		v=sc.nextLong();
//		boolean m;
//		m=sc.nextBoolean();
//		String g;   
//		g=sc.next();
//		char l;
//		l=sc.next().charAt(4);
//		System.out.println(l);
		int a=sc.nextInt();
		if (a>100)
		{
			System.out.println("invalid percentage");
			return;
		}
		else if(a>90 && a<=100)
			System.out.println("Outstanding");
		else if (a>80 && a<=90)
			System.out.println("excellent");
		else if(a>70 && a<=80)
			System.out.println(" good");
		else if(a>50 && a<=70 )
			System.out.println("Average");
		else
			System.out.println("poor");
	}
	
}