package com.oc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This singleton Pattern for Database connection and access 
 * is not thread safe, we may use a static declaration and instantiation right from the beginning of the class
 * or use a pool instead...
 */
public class Singleton {

	// The singleton instantiated from the JVM start
	private static Singleton single = new Singleton();
	
	//URL de connexion
	private String url = "jdbc:postgresql://localhost:5432/Ecole";
	//Nom du user
	private String user = "test";
	//Mot de passe de l'utilisateur
	private String passwd = "test";
	//Objet Connection
	private static Connection connect;

	//Constructeur privé
	private Singleton(){
		try {
			connect = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static Connection getInstance(){
		if(single == null || connect == null){
			new Singleton();
		}
		return connect;   
	}   
}