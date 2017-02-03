package ru.skb_lab.files;

import java.util.HashMap;
import java.sql.Statement;

public interface IReadFiles<K, V> {
	
	public String getFileName(); 
	
	public Statement getFileData();
	
	public HashMap<K, V> getRequest();	
	
}
