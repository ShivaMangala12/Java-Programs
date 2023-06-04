package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class customer1 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5", "root", "1234");
			Statement st=con.createStatement();
			System.out.println("enter the table name");
			String tname=sc.next();
		st.execute("create table "+tname+" (id int primarykey  ,name varchar(45) notnull , unit_consumed int notnull,rupees int notnull,1unit2rs int notnull)");
	     boolean b=false;
	     int insert=1;
	     while(!b)
	     {
	    	 if(insert==1)
	    	 {
	    		 System.out.println("press 1 for inserting values");
	    	 }
	    	 System.out.println("press 2 for updating values");
	    	 System.out.println("PRESS 3 for fetching values");
	    	 int n=sc.nextInt();
	    	 switch (n)
	    	 {
	    	 case 1:
	    	 {
	    		 PreparedStatement p1=con.prepareStatement("insert into "+tname+" values(?,?,?)");
	    		 boolean b1=false;
	    		 while(!b1)
	    		 {
	    			 System.out.println("enter the slno ");
	    			 p1.setInt(1, sc.nextInt());
	    			 System.out.println("enter the name");
	    			 p1.setString(2, sc.next());
	    			 System.out.println("enter the unit_consumed");
	    			 p1.setInt(3,sc.nextInt());
	    			 System.out.println("press 1 for inserting more values");
	    			 if(sc.nextInt()==1)
	    			 {
	    				 b1=false;
	    			 }
	    			 else
	    			 {
	    				 b1=true;
	    			 }
	    			 p1.execute();
	    			 insert=0;
	    	    }
	    		 break;
	    	 }
	    	 case 2:
	    	 {
	    		 PreparedStatement p2=con.prepareStatement("update "+tname+"  set name=? where id=? "); 
//	    		 System.out.println("enter the id");
//	    		 p2.setInt(1, sc.nextInt());
	    		 System.out.println("enter the slno");
	    		 p2.setString(2,sc.next());
	    		 System.out.println("enter the name");
	    		 p2.setInt(3,sc.nextInt());
	    		 System.out.println("enter the units_consumed");
	    		 p2.setInt(1, sc.nextInt());
	    		 p2.execute();
	    		 System.out.println("values updated");
	    		 break;
	    	 }
	    	
	    	 case 3:
	    		 
	    		 PreparedStatement p1=con.prepareStatement("select * from  where (slno=?)");
	    	 
	    	 
	    	 
	    	 
	    	 }
	     }
	     
	   
		}
		
		catch(ClassNotFoundException |SQLException e)
		{
			e.getMessage();
		}
	}
	

}
