package encapsulation;

import java.util.Objects;

class student
{
	private int id;
	private String name;
	private int age;
	private String email;
	private long phone;
	private char sec;
	private String school;
	public student(int id, String name, int age, String email, long phone, char sec, String school) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.sec = sec;
		this.school = school;
	}
	public int  getid()
	{
		return this.id;
	}
	
	public void setid(int id)
	{
		 this.id=id;
	}
	public String getname()
	{
		return this.name;
	}
	
	public void setname(String name)
	{
		 this.name=name;
	}
	public int getage()
	{
		return this.age;
	}
	
	public void setage(int age)
	{
		 this.age=age;
	}
	public String getemail()
	{
		return this.email;
	}
	
	public void setemail(String email)
	{
		 this.email=email;
	}
	public long getphone()
	{
		return this.phone;
	}
	
	public void setphone(long phone)
	{
		 this.phone=phone;
	}
	public int getsec()
	{
		return this.sec;
	}
	
	public void setsec(char sec)
	{
		 this.sec=sec;
	}
	public String getschool()
	{
		return this.school;
	}
	
	public void setschool(String school)
	{
		 this.school=school;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone
				+ ", sec=" + sec + ", school=" + school + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, id, name, phone, school, sec);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return age == other.age && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && phone == other.phone && Objects.equals(school, other.school)
				&& sec == other.sec;
	}
	
	
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student p=new student(23, "veeresh", 45, "ghj", 56, 'c',"uytt");
		System.out.println(p.toString());
		student p2=new student(23, "veeresh", 45, "ghj", 56, 'c',"uytt");
		System.out.println(p.toString());
		System.out.println(p.equals(p2));
	}

}
