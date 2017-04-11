package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 			inputStream     				
 * FileInputStream   ByteArrayInputStream
 * 			OutputStream
 * FileOutputStream  ByteArrayOutputStream
 * 
 * @category   内存输入/输出流 
 * @author chengchen
 * @date Apr 11, 2017
 * @time 12:55:34 PM
 * @param
 */
public class ByteArrayInputAndOutputStream {

	public static void main(String[] args) throws IOException {
		String s= "hello world";
		InputStream inputStream =new ByteArrayInputStream(s.getBytes());
		OutputStream outputStream =new ByteArrayOutputStream();
		int temp =0;
		while((temp=inputStream.read())!=-1){
			outputStream.write(temp);
		}
		String newStr =outputStream.toString();
		System.out.println(outputStream.getClass()+"   "+newStr);
		outputStream.close();
		inputStream.close();
	}
}


