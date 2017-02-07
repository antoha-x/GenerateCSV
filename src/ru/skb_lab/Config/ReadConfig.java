package ru.skb_lab.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadConfig {
	
	Properties properties = new Properties();
	FileInputStream fis = null;
	
	public ReadConfig() {
		try {
	    	properties = new Properties();
	    	fis = new FileInputStream("src/ru/skb_lab/Config/config.properties");
	    	properties.load(fis);
	        
	        String host = properties.getProperty("db.host");
	        String login = properties.getProperty("db.login");
	        String password = properties.getProperty("db.password");
	        String separator = properties.getProperty("file.separator");
	        String in = properties.getProperty("directory.in");
	        String out = properties.getProperty("directory.out");
	        System.out.println("HOST: " + host
	                        + ", LOGIN: " + login
	                        + ", PASSWORD: " + password
	                        +", SEPARATOR:" + separator
	                        +",IN:" + in
	                        +",OUT:" + out);
	
	    } catch (IOException e) {
	        System.err.println("ОШИБКА: Файл свойств отсуствует!" + e.getMessage());
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    } finally {
	    	try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		
	}
    
    public Properties getProp() {	    
	    return properties;
    }
}
