package scanner;

public class pattern5 {

	public static void main(String[] args) {
		int s=5;
		int v=1;
		for(int i=0;i<3;i++)
		{
			if(i<2)
			{
			for(int j=0;j<s;j++)
			{
				 
				System.out.print(v+" ");
				v=v+1;
			}
			System.out.println();
			int k=v+4;
			for(int j=0;j<s;j++)
			{
				 
				System.out.print(k+" ");
				k=k-1;
			}
			System.out.println();
			v=k+6;
			}
			else
			{
				for(int j=0;j<s;j++)
				{
					 
					System.out.print(v+" ");
					v=v+1;
				}
				System.out.println();
			}
		}

	}

}
