package advance_java;

public class threepara2<T,V,S> {
	T ob1;
	V ob2;
	S ob3;
	

	public threepara2(T ob1, V ob2, S ob3) {
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
	threepara2 display(threepara stud1)
	{
		return null;
	}
	
	public static void main(String[] args) {
		threepara<Integer,String,Double> stud=new threepara<Integer,String,Double>(88,"veeresh",90.56);
		System.out.println("Roll No:"+stud1.ob1+"Name:"+stud1.ob2+"avg:"+stud1.ob3);
	}

}
