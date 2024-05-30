package Array;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int a[]=new int[4];
//		for(int i=0;i<a.length;i++)
//		{
//			int data=s.nextInt();
//			a[i]=data;
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		System.out.println("enter the size");
		int w= s.nextInt();
		String a[]=new String[w];
		for(int i=0;i<a.length;i++)
		{
			String data=s.next();
			a[i]=data;
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	

}
