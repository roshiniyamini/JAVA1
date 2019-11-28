package com.HCL.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Agent {
	
	
	public static void main(String[] args) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Data1","root","root");
	System.out.println("Connected.........");
	Statement st = con.createStatement();


	ResultSet rs = st.executeQuery("Select AgentId,Firstname,Gender,City from Agent");
	while(rs.next()) {
	System.out.println("\nAgentId : " +rs.getInt("AgentId"));
	System.out.println("Firstname : " +rs.getString("Firstname"));
	System.out.println("Gender : " +rs.getString("Gender"));
	System.out.println("City :" +rs.getString("City"));

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


