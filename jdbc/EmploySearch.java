package com.HCL.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) throws ClassNotFoundException {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Data1","root","root");
			String cmd="select *from Employ where Empno=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,  empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("Name "+rs.getString("Name"));
				
				System.out.println("Department "+rs.getString("Dept"));
				System.out.println("Designation "+rs.getString("Desig"));
				System.out.println("Sal "+rs.getInt("Basic"));
			}else{
				System.out.println("Record not found...");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
