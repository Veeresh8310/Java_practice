package advance_java;

 class Gen<T> {
	T a;
	T b;
	
	 Gen(T x,T y)
	{
		a=x;
		b=y;
	}
	void swap()
	{
		T t=a;
		a=b;
		b=t;
	}
	T geta()

	{
		return a;
	}
	T getb()
	{
		return b;
	}
 }
	public class swap{
	public static void main(String[] args) {
		Gen<Integer> g=new Gen<Integer>(20,30);
		int pint,qint;
		pint=g.geta();
		qint=g.getb();
		System.out.println("Before Swapping Integers: ");
		System.out.println("pint="+pint+"qint="+qint);
		g.swap();
		pint=g.geta();
		qint=g.getb();
		System.out.println("After Swapping Integers: ");
		System.out.println("pint="+pint+"qint="+qint);
		System.out.println();
		
		Gen<String> h=new Gen<String>("Veeresh","Akki");
		String pstr,qstr;
		pstr=h.geta();
		qstr=h.getb();
		System.out.println("Before Swapping Strings: ");
		System.out.println("pstr=" +pstr+ "qstr =" +qstr);
		h.swap();
		pstr=h.geta();
		qstr=h.getb();
		System.out.println("After Swapping Strings: ");
		System.out.println("pstr =" +pstr+ "qstr ="+qstr);
		System.out.println();
		

	}

}
