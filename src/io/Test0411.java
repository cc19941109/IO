package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
//字符输出流   字符输入流  操作缓存区   
// 字节输入输出流   操作数据终端

public class Test0411 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\chengchen2\\Desktop\\learn\\io.txt");
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();	
		}
		OutputStream output =new FileOutputStream(file,true);//这一步会创建文件
		String data =" \r\n nihao hello world";//   \r\n 表示换行
 		
		output.write(data.getBytes(),0,11);
		output.close();

	}

}
