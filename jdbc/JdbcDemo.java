package com.HCL.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Data1","root","root");
		System.out.println("Connected...");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from Employ");
		while(rs.next()){
			System.out.println("Employ No "+rs.getInt("empno"));
			System.out.println("Name "+rs.getString("name"));
			System.out.println("Department "+rs.getString("dept"));
			System.out.println("Designation "+rs.getString("desig"));
			System.out.println("Salarly "+rs.getInt("basic"));
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
