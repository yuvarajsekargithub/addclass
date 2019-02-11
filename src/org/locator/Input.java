package org.locator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Input {
	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\YUVARAJ\\Desktop\\Sample\\Java\\sample.txt");
	//boolean b = f.exists();
	//System.out.println(b);
	
	//boolean directory = f.isDirectory();
	//System.out.println(directory);
	
	
	//To Create the Folder
	//boolean mkdir = f.mkdir();
	//System.out.println(mkdir);
	
	//To Create the multiple folder
	//boolean mkdirs = f.mkdirs();
	//System.out.println(mkdirs);
	
	//boolean exists = f.exists();
	//System.out.println(exists);
    // To check the Absolute Path
	//String path = f.getAbsolutePath();
	//System.out.println(path);
	
	 //To Create the Text File
	//boolean createNewFile = f.createNewFile();
	//System.out.println(createNewFile);
	
	// To list the filename in the Folder
	//String[] list = f.list();
	//for ( String li:list) {
	//System.out.println(li);
	//
	
	FileWriter fw = new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("Welcome to Java");
	bw.newLine();
	bw.write("Yuvaraj");
	bw.close();
    System.out.println("Sucess");
	
	/*FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String s = null;
	while((s=br.readLine()) !=null) {
		System.out.println(s);
	}*/
		
	//}

	
	

			
	}

}
