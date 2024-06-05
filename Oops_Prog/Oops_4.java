package oops;
class person{
	
	int id;
	int age;
	String name;
	String email;
	long phone;
	public person(int id, int age, String name, String email, long phone) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
//	static person p=new person();

//	public static person createobject(int id,int age,String name,String email,long phone)
//	{
//		return p;
//	}
}
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person inst1=new person(43, 34, "fgh", "sgsg", 534678880);
		person inst2=new person(431, 334, "bhfgh", "tysgsg", 709878880);
		System.out.println(inst1);
		System.out.println(inst2);
	}

}
