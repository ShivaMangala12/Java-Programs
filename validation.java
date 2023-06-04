package test1;
import java.sql.*;

import java.util.Scanner;

public class validation 

{
      
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url= "jdbc:mysql://localhost:3306/sys";
			String username="root";
			String password="1234";
			Connection con =DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			
			
			System.out.println("enter any details 1.id 2.name 3.mobile");
			int ans=sc.nextInt();
			
			switch(ans)
			{
			case 1:
				
			       System.out.println("enter the id");
			       int ans1=sc.nextInt();
			       if(ans1==101)
			       {
			    	   System.out.println("entered data is matched");
			       }
			       else
			       {
			    	   System.out.println("please try again");
			       }
			       break;
			
			
			case 2: 
			{
				System.out.println("enter the name");
				String ans2=sc.next();
				if(ans2.equalsIgnoreCase("shiva"));
				{
					System.out.println("entered data is matched");
				}
			}
			}
			
			
			
			
             ResultSet ks =st.executeQuery("select * from details");
			
            
             
             
             
			
//			
//			if(ks.next())
//			{
//			   int id=ks.getInt(1);
//			   String name=ks.getString(2);
//			   long mobilenumber =ks.getLong(3);
//			   System.out.println(id+"  "+name+" "+mobilenumber);
//			}
////			else
//			{
//				System.out.println("failed");
//				
//			}
//		
			
		}
		 catch (ClassNotFoundException|SQLException e) {
		
			e.printStackTrace();
		}
		

	}
	
}
