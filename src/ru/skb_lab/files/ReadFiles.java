package ru.skb_lab.files;

import java.sql.Statement;
import java.util.HashMap;

public class ReadFiles implements IReadFiles<String, Statement>, IFiles {

	@Override
	public void setDirectory(String directory) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return " ";
	}

	@Override
	public HashMap<String, Statement> getRequest() {
		// TODO Auto-generated method stub
		return new HashMap<String, Statement>();
	}



}
