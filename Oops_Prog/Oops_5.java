package oops;

import java.util.Objects;

class book{
	int pages;
	String title;
	String author;
	int price;
	 book(int pages, String title, String author, int price) {
		this.pages = pages;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, pages, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		return Objects.equals(author, other.author) && pages == other.pages && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	
	
}
public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1=new book(43,"fgh", "sgsg", 534678880);
		book b2=new book(43, "fgh", "sgsg", 534678880);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b1));
	}

}
