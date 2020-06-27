package com.rest.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationAndDeserialization {
	
	public static void SerializeToFile(Object classObject, String filename )
	{
		try {
			FileOutputStream fileoutput = new FileOutputStream(filename);
			
			ObjectOutputStream outputstream = new ObjectOutputStream(fileoutput);
			
			outputstream.writeObject(classObject);
			
			outputstream.close();
			fileoutput.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(18,78);
		SerializeToFile(rect, "rectSerialize");
	}

	
}
