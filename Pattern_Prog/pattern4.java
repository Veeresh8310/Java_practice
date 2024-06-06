package scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=5;
		int k=1;
		int v=1;
		for(int i=0;i<5;i++)
		{
			v=k;
			for(int j=0;j<s;j++)
			{
				 
				System.out.print(v+"  ");
				v=v+5;
			}
				k=k+1;
				
			System.out.println();
		}
	}

}
