package org.tnt.file_handling;

import java.io.File;
import java.io.IOException;

public class DemoOfFileHandling {
	
	public static void main(String[] args) {
		
		File file = new File("abc.txt");
		
		
			try {
				if(!file.exists())
				{
				file.createNewFile();
				System.out.println("File is created..");
				}
				else{
					System.out.println("File is already present..");
				}
			} 
			catch (IOException e) {
				System.out.println("Some error while working on file");
				e.printStackTrace();
			}
		
		
		
	}

}
