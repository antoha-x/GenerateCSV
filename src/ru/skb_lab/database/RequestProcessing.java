package ru.skb_lab.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class RequestProcessing {
	
	Connection connection = null;
	
	public RequestProcessing(Properties prop) {
		try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    connection = DriverManager.getConnection(prop.getProperty("db.host"),prop.getProperty("db.login"),
		    		prop.getProperty("db.password"));
		} catch (ClassNotFoundException cnfe) {
		    System.out.println("Where is your MySQL JDBC Driver?");
		    cnfe.printStackTrace();
		} catch (SQLException e) {
	        e.printStackTrace();
		}
	}
}
