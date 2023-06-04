package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import friends.create;

public class pro3 
{
	 static int n=0;
		public static void insert(pro2 c)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "1234");
				PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?)");
				
				int id=c.getId();
				String name=c.getName();
				long mobilenumber=c.getMobilenumber();
				
				ps.setInt(1,id);
				ps.setString(2, name);
				ps.setLong(3, mobilenumber);
				
				
				n=n+ps.executeUpdate();
				System.out.println(n+"records inserted");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
