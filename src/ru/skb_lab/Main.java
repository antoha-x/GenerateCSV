package ru.skb_lab;
 
import java.util.HashMap;
import java.util.Properties;

import ru.skb_lab.Config.ReadConfig;
import ru.skb_lab.files.ReadFiles;
 
public class Main {
	
	private static final String PATH_CONFIG = "src/ru/skb_lab/Config/config.properties";
 
	public static void main(String[] args) {
 
		Properties prop = new ReadConfig(PATH_CONFIG).getProp();    
		HashMap<String, String> requests = new ReadFiles(prop).getRequest();
        
    	for (String el : requests.keySet()) {
    		System.out.print(el);
    		System.out.println(requests.get(el));
    	} 
    }
 
}