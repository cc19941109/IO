package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStream {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "hello world ";
		int temp =0;
		InputStream inputStream =new ByteArrayInputStream(string.getBytes());
		OutputStream outputStream =new ByteArrayOutputStream();
		PrintStream out =new PrintStream(outputStream);
		
		while((temp=inputStream.read())!=-1){
			out.print((char)Character.toUpperCase(temp));
			
		}
	}

}
