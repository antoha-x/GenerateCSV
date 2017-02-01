package ru.skb_lab.files;

public interface ISaveFile {
	
	public void setSeparator(char seperator);
	
	public void saveToFile(String fileName, StringBuilder data);	
	
}