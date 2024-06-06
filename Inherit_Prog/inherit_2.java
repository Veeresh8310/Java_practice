package inheritance;
class human
{
	int age;
	String name;
	int height;
	int weight;
	char gender;
	String color;
	String status;
	public human(int age, String name, int height, int weight, char gender, String color, String status) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.color = color;
		this.status = status;
	}
	
	
	
	
	
}

class student extends human{
	String usn;
	String college;
	char sec;
	int standard;
	int result;
	public student(int age, String name, int height, int weight, char gender, String color, String status, String usn,
			String college, char sec, int standard, int result) {
		super(age, name, height, weight, gender, color, status);
		this.usn = usn;
		this.college = college;
		this.sec = sec;
		this.standard = standard;
		this.result = result;
	}
	@Override
	public String toString() {
		return "student [usn=" + usn + ", college=" + college + ", sec=" + sec + ", standard=" + standard + ", result="
				+ result + ", age=" + age + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", color=" + color + ", status=" + status + "]";
	}
	
	


	
	
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s =new student(20, "fgg", 10, 50, 'm', "hktj", "kili", "gjyj", "jyjyj", 'c', 60, 70);
		System.out.println(s);
	}

}
