package inheritance;
class calci{
	public int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public int sub  (int a,int b)
	{
		System.out.println(a-b);
		return a-b;
	}
}

class advcalci extends calci
{
	public int mul(int a,int b)
	{
		System.out.println(a*b);
		return a*b;
	}
	
	public int division(int a,int b)
	{
		System.out.println(a/b);
		return a/b;
	}
}

class  veryadvcalci extends advcalci{
	
	public double pow(int a,int b)
	{
		
		return Math.pow(a,b);
	}
}
public class demo1 {

	public static void main(String[] args) {
		advcalci c=new advcalci();
		c.add(2, 5);
		c.sub(2, 5);
		c.mul(2, 5);
		c.division(20, 5);
		calci c1=new calci();
		c1.add(45, 70);
		c1.sub(30, 900);
		veryadvcalci c2=new veryadvcalci();
		double po=c2.pow(2, 3);
		System.out.println(po);

	}

	

}
