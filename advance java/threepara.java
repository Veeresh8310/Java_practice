package advance_java;

public class threepara<T,V,S> {
	T ob1;
	V ob2;
	S ob3;
	

	public threepara(T ob1, V ob2, S ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	void showTypes()
	{
		System.out.println("Type of T is "+ob1.getClass().getName());
		System.out.println("Type of V is "+ob2.getClass().getName());
		System.out.println("Type of S is "+ob3.getClass().getName());
	}
	T getob1() {
		return ob1;
		
	}
	V getob2()
	{
		return ob2;
	}
	S getob3()
	{
		return ob3;
	}


	public static void main(String[] args) {
		threepara<Integer,String,Double> three=new threepara<Integer,String,Double>(88,"veeresh",90.56);
		three.showTypes();
		int v=three.getob1();
		String s=three.getob2();
		double d=three.getob3();
		System.out.println("Roll No :"+v);
		System.out.println("Name :"+s);
		System.out.println("Avg :"+d);
		
		threepara<Integer,String,Double> emp=new threepara<Integer,String,Double>(881,"veeresh",905.6);
		emp.showTypes();
		int k=emp.getob1();
		String l=emp.getob2();
		double o=emp.getob3();
		System.out.println("Id :"+k);
		System.out.println("Name :"+l);
		System.out.println("Salary :"+o);
	}

}
