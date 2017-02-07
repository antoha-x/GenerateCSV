package ru.skb_lab.files;

public interface ISaveFile {
	
	public char getSeparator();
	
	public void saveToFile(String fileName, StringBuilder data);	
	
}