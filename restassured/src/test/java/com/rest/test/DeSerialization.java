package com.rest.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialization {
	public static Object DeSerializeFromFileToObject (String filename)
	{
		try {
			FileInputStream fileinput = new FileInputStream(new File(filename));
			ObjectInputStream inputStream = new ObjectInputStream(fileinput);
			Object  deserialization = inputStream.readObject();
			
			inputStream.close();
			fileinput.close();
			
			return deserialization;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
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
		Rectangle rect = new Rectangle(50, 500);
		SerializeToFile(rect, "rectSerialize");

		Rectangle deSerializedRect = (Rectangle)DeSerializeFromFileToObject("rectSerialize");
		System.out.println("<<<<<<<>>>>>>"+deSerializedRect.Area());
	}

}
