package ru.skb_lab;
 
import java.util.HashMap;
import java.util.Properties;

import ru.skb_lab.Config.ReadConfig;
import ru.skb_lab.files.ReadFiles;
 
public class Main {
 
	public static void main(String[] args) {
 
		Properties prop = new ReadConfig().getProp();    
		HashMap<String, String> requests = new ReadFiles(prop).getRequest();
        
    	for (String el : requests.keySet()) {
    		System.out.print(el);
    		System.out.println(requests.get(el));
    	} 
    }
 
}