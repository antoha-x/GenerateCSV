package ru.skb_lab.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class ReadFiles implements IReadFiles<String, String>, IFiles {

	private final String OPEN_DIRECTORY;
	private final String FILE_EXTENSION;
	
	private ArrayList<String> fileNames = new ArrayList<String>();
	private HashMap<String, String> requests = new HashMap<String, String>();
	
	public ReadFiles(Properties prop) {
		this.OPEN_DIRECTORY = prop.getProperty("directory.out");
		this.FILE_EXTENSION = prop.getProperty("file.extension");
	}
	
	@Override
	public String getDirectory() {
		return this.OPEN_DIRECTORY;
	}
	
	@Override
	public HashMap<String, String> getRequest() {
		
		fileNames = getFileNames();
				
		for (String el: fileNames) {
			requests.put(el.substring(0, el.indexOf(getExtension())), getFileData(getDirectory(), el));
		}
		 
		return requests;
	}

	public String getExtension() {
		return FILE_EXTENSION;
	}
	
	private ArrayList<String> getFileNames() {
		ArrayList<String> fn = new ArrayList<String>();
		
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(OPEN_DIRECTORY))) {
            for (Path file: stream) {
                if(!file.toFile().isDirectory() ) {
                	if (file.getFileName().toString().endsWith(FILE_EXTENSION))
                		fn.add(file.getFileName().toString());                	
                }
            }
        } catch (IOException | DirectoryIteratorException x) {
                System.err.println(x);
        }
		
		return fn;
	}
	
	private String getFileData(String filePath, String fileName) {
		
	    StringBuilder sb = new StringBuilder();	 
	    try {
	        BufferedReader in = new BufferedReader(new FileReader(filePath+fileName));
	        try {
	            String line;
	            while ((line = in.readLine()) != null) {
	                sb.append(line);
	                sb.append(" ");
	            }
	        } finally {	            
	            in.close();
	        }
	    } catch(IOException e) {
	        e.getStackTrace();
	    }	 
	    return sb.toString();
	}

}
