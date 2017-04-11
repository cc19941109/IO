package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FastCopyBigFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 =new File("C:\\Users\\chengchen2\\Desktop\\learn\\项目注解.docx");
		File f2 = new File("C:\\Users\\chengchen2\\Desktop\\learn\\ioDemo\\xmzjCopy.docx");
		nioTransferCopy(f1, f2);
		
	}

	private static void nioTransferCopy(File source, File target) {  
	    FileChannel in = null;  
	    FileChannel out = null;  
	    FileInputStream inStream = null;  
	    FileOutputStream outStream = null;  
	    try {  
	        inStream = new FileInputStream(source);  
	        outStream = new FileOutputStream(target);  
	        in = inStream.getChannel();  
	        out = outStream.getChannel();  
	        in.transferTo(0, in.size(), out);  
	        System.out.println(in.size());
	        inStream.close();
	    	outStream.close();
	    	in.close();
	    	out.close();
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    } 
	}  
	
}
