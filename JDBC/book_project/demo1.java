package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class library{
	private static Connection getconnection()
	{
		Connection c=null;
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/LibraryDataBaseManagement";
			String uname="postgres";
			String pass="root";
			c=DriverManager.getConnection(url, uname, pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
 public static void insertbooks(book b)
	{
		Connection c=library.getconnection();
		String query="insert into librarydata values(?,?,?,?,?)";
		try {
			PreparedStatement statement=c.prepareStatement(query);
			statement.setInt(1,b.id);
			statement.setString(2, b.bname);
			statement.setString(3, b.author);
			statement.setString(4, b.publication);
			statement.setDouble(5, b.price);
			int i=statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
 public static void updatebook(double price,int id)
 {
	 Connection c=library.getconnection();
	 String query="update librarydata set price=? where id=?";
	 try {
		PreparedStatement s=c.prepareStatement(query);
		s.setDouble(1, price);
		s.setInt(2, id);
		int i=s.executeUpdate();
		System.out.println(i);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public static void deletebook(int id) {
		try {
			Connection c=library.getconnection();
			String query="delete from librarydata where id=?";
			PreparedStatement statement=c.prepareStatement(query);
			statement.setInt(1, id);
			int i=statement.executeUpdate();
			System.out.println(i);
			if(i==1)
			{
				System.out.println("the data has been succesfully deleted");
			}
			else
			{
				System.out.println("the data doesnot exist");
			}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}
 
 public static void getalldetails() {
		try {
			Connection c=library.getconnection();
			Statement statement=c.createStatement();
			String query="select * from librarydata";
			ResultSet set=statement.executeQuery(query);
			boolean next=set.next();
			while(next)
			{
				int id=set.getInt(1);
				String bname=set.getString(2);
				String author=set.getString("author");
				String publication=set.getString("publication");
				double price=set.getDouble("price");
				System.out.println(id);
				System.out.println(bname);
				System.out.println(author);
				System.out.println(publication);
				System.out.println(price);
				System.out.println("==========");
				next=set.next();

				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
 
 public static void getbyid(int id)
 {
	 
	 Connection c=library.getconnection();
	 String query="select * from librarydata where id=?";
	 PreparedStatement s;
	try {
		s = c.prepareStatement(query);
		s.setInt(1, id);
		ResultSet set=s.executeQuery();
		boolean next=set.next();
		if(next)
		{
			int id2=set.getInt(1);
			String bname=set.getString(2);
			String author=set.getString(3);
			String publication=set.getString(4);
			double price=set.getDouble(5);
			System.out.println("id="+id2);
			System.out.println("bname"+bname);
			System.out.println("author"+author);
			System.out.println("publication"+publication);
			System.out.println("price="+price);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
public class demo1 {

	public static void main(String[] args) {
		book b1=new book(2,"2states","chethan","alvas",6567);
		library.insertbooks(b1);

	}

}
