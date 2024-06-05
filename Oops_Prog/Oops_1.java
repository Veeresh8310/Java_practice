package oops;
class marker1 {
	String color;
	String brand;
	double price;

public static void update(marker1 s,String color,String brand,double price)
{
	s.color=color;
	s.brand=brand;
	s.price=price;
}
public static void display(marker1 m)
{
System.out.println(m.color);
System.out.println(m.brand);
System.out.println(m.price);
}
}
public class demo1{
	public static void main(String[] args) {
		marker1 m=new marker1();
		marker1.update(m,"black","camelin",5.98);
		marker1.display(m);
//		System.out.println(m.color);
//		System.out.println(m.brand);
//		System.out.println(m.price);
//		
		marker1 m1=new marker1();
		marker1.update(m1,"red","cam",9.68);
		marker1.display(m1);
//		System.out.println(m1.color);
//		System.out.println(m1.brand);
//		System.out.println(m1.price);
		
		

	}
}

