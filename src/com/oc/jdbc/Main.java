package com.oc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {


	    try {
	        Class.forName("org.postgresql.Driver");
	        System.out.println("Driver O.K.");

	        String url = "jdbc:postgresql://localhost:5432/Ecole";
	        String user = "test";
	        String passwd = "test";

	        Connection conn = DriverManager.getConnection(url, user, passwd);
	        System.out.println("Connexion effective !");         
	           
	      } catch (Exception e) {
	        e.printStackTrace();
	      }    
	}

}
