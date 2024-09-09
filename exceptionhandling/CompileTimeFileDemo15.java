package com.evergent.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		
		try {
		  File file = new File("C:/Users/Asritha.Butty/Desktop/Evergent Support/File not found/tt.txt/");
          Scanner s = new Scanner(file);
        
           while(s.hasNextLine()) {
        	   System.out.println(s.nextLine());
           }
          s.close();
		}
		
		catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());	
		}	
	}
}
