package io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test0411_writer {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\chengchen2\\Desktop\\learn\\io.txt");
		Writer out = new FileWriter(file);
		String data = "\r\n new output";
		out.write(data);
		out.close();
		if (file.exists()) {
			Reader in =new FileReader(file);
			char data1[] =new char[1024];
			int len =in.read(data1);
			System.out.println(new String(data1,0,len));
			in.close();
		}
	}

}
