package demo1;

public class book {
 int id;
 String bname;
 String author;
 String publication;
 double price;
 
	@Override
public String toString() {
	return "book [id=" + id + ", bname=" + bname + ", author=" + author + ", publication=" + publication + ", price="
			+ price + "]";
}

	public book(int id, String bname, String author, String publication, double price) {
	
	this.id = id;
	this.bname = bname;
	this.author = author;
	this.publication = publication;
	this.price = price;
}

	public static void main(String[] args) {
		

	}

}
