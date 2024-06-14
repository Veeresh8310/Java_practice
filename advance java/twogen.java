package advance_java;

public class twogen<T,V> {
	T ob1;
	V ob2;
	twogen(T o1,V o2)
	{
		ob1=o1;
		ob2=o2;
		
	}
	void showType()
	{
		System.out.println("Type of T is "+ob1.getClass().getName());
		System.out.println("Type of V is "+ob2.getClass().getName());
	}
	T getob1()
	{
		return ob1;
		
	}
	V getob2()
	{
		return ob2;
	}

	public static void main(String[] args) {
		twogen<Integer,String> twopara=new twogen<Integer,String>(88,"veeresh");
		twopara.showType();
		int v=twopara.getob1();
		String s=twopara.getob2();
		System.out.println("Value :"+v);
		System.out.println("Value :"+s);
	}

}
