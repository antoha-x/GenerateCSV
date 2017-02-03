package ru.skb_lab.files;

import java.util.Properties;

public class SaveCSV implements ISaveFile, IFiles {

	private final char separator;
	private final String saveDirectory;
	
	
	public SaveCSV(Properties prop) {
		separator = prop.getProperty("file.separator").charAt(0);
		saveDirectory = prop.getProperty("directory.out");
	}
	
	
	@Override
	public char getSeparator() {		
		return separator;
	}

	@Override
	public String getDirectory() {
		return saveDirectory;
	}

	@Override
	public void saveToFile(String fileName, StringBuilder data) {
		// TODO Auto-generated method stub
		
	}


	



	
	
	

}
