package ru.skb_lab.files;

import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;


public class ReadFiles implements IReadFiles<String, Statement>, IFiles {

	private final String openDirectory;
	
	public ReadFiles(Properties prop) {
		this.openDirectory = prop.getProperty("directory.out");	
	}
	
	@Override
	public String getDirectory() {
		// TODO Auto-generated method stub
		
		return this.openDirectory;
	}
	

	@Override
	public HashMap<String, Statement> getRequest() {
		// TODO Auto-generated method stub
		return new HashMap<String, Statement>();
	}

	@Override
	public Statement getFileData() {
		// TODO Auto-generated method stub
		return null;
	}



}
