package Array;

public class demo1 {

	public static void main(String[] args) {
		int[] a=new int[5];
		System.out.println(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		a[0]=4;
		for(int b:a)
		{
			System.out.println(b);
		}
	

	}

}
