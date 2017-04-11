package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyBigFile {

	public static void main(String[] args) {
		for(int i= 0;i<args.length;i++){
			System.out.println("第"+i+"个 = "+args[i]);
		}
		
//		if(args.length!=2){
//			System.out.println(args.toString());
//			System.out.println("执行程序命令错误");
//			System.exit(1);
//		}
		String s1 ="C:\\Users\\chengchen2\\Desktop\\learn\\项目注解.docx";
		String s2 ="C:\\Users\\chengchen2\\Desktop\\learn\\ioDemo\\xmzjCopy.docx";
		copy(s1,s2);
	
		
	}
	
	public static void copy(String s1,String s2){
		long start =System.currentTimeMillis();
		System.out.println(start);
		File file1 = new File(s1);
		if(!file1.exists()){
			System.out.println("源程序不存在");
			System.exit(1);
		}
		File file2 =new File(s2);
		
		try {
			InputStream inputStream =new FileInputStream(file1);
			OutputStream outputStream =new FileOutputStream(file2);
			int temp =0;
			byte data[] =new byte[1024];
			while((temp=inputStream.read(data))!=-1){
				outputStream.write(data,0,temp);
			}
			long end =System.currentTimeMillis();
			System.out.println("花费时间为："+(end-start));
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
