package ru.skb_lab.files;

import java.util.HashMap;

public interface IReadFiles<K, V> {
	
	public String getFileName();
	
	public HashMap<K, V> getRequest();	
	
}
