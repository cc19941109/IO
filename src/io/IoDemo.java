package io;
import java.io.File;
import java.io.IOException;

public class IoDemo {
//java.io.file;类只用于表示文件目录的信息  （名称大小）
//不能用于文件内容的访问
	
	public static void main(String[] args) throws Exception {
		//了解构造函数的情况 查帮助
		File file = new File("C:\\Users\\chengchen2\\Desktop\\learn\\ioDemo");
		System.out.println(file.exists());
		if(!file.exists())
			file.mkdirs();
		else
			file.delete();
		//是否是一个目录
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isAbsolute());
		File file2 = new File("C:\\Users\\chengchen2\\Desktop\\learn\\ioDemo","2.txt");
		if(!file2.exists())
			file2.createNewFile();
		System.out.println("file2存在么？"+file2.exists());
		System.out.println(file2);
		
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		
		File file3 = new File("C:\\Users\\chengchen2\\Desktop\\learn\\ioDemo\\3.txt");
		
		
		
	}

}
