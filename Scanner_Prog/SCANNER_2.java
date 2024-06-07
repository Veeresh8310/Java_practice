package scanner;

public class dig {

	public static void main(String[] args) {
		int digit=850;
		int t;
		int sum=0;
		while(digit!=0)
		{
			t=digit%10;
			sum=sum+t;
			digit=digit/10;
			
		}
		System.out.println(sum);
	}

}
