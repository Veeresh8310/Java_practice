package oops;
class laptop {
	String brand;
	int ram;
	int rom;
	int price;
	String graphics;
	String color;
	String processor;

	public laptop(String brand,int ram,int rom,int price,String graphics,String color,String processor)
	{
	this.brand=brand;
	this.ram=ram;
	this.rom=rom;
	this.price=price;
	this.graphics=graphics;
	this.color=color;
	this.processor=processor;
	}
	private  laptop(String brand,int ram,int price,String color)
	{
	this.brand=brand;
	this.ram=ram;
	this.price=price;
	this.color=color;
	}
	public static laptop createobject(String brand,int ram,int price,String color)
	{
		return new laptop(brand,ram,price,color);
	}
	
	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", ram=" + ram + ", rom=" + rom + ", price=" + price + ", graphics="
				+ graphics + ", color=" + color + ", processor=" + processor + "]";
	}
	
}
public class demo3 {

	public static void main(String[] args) {
		laptop l=new laptop("lenovo",4,256,78765,"m","black","fnjl");
		System.out.println(l);
		laptop l1= laptop.createobject("lenovo",4,78765,"black");
		System.out.println(l1.toString());

	}

}
