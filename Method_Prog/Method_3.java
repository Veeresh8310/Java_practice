package methods;
class calculator {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}
	public static int division(int a,int b)
	{
		return a/b;
	}
}
public class demo3 {

	public static void main(String[] args) {
		int x=calculator.add(2,5);
		System.out.println(x);
		int y=calculator.add(2,5,8);
		System.out.println(y);
		int z=calculator.sub(7,5);
		System.out.println(z);
		int t=calculator.multiplication(2,5);
		System.out.println(t);
		int g=calculator.division(10,5);
		System.out.println(g);

	}

}
