package test1;
import java.sql.*;
import java.util.Scanner;

import friends.create;
import friends.insert;
public class mainclass1
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		System.out.println("enter the name ");
		String name=sc.next();
		
		System.out.println("enter the mobilenumber");
		long mobilenumber=sc.nextLong();
		
		pro2 p2=new pro2();
	     p2.setId(id);
	     p2.setName(name);
	     p2.setMobilenumber(mobilenumber);
	     
	     
	      pro3.insert(p2);
	}
	

}
