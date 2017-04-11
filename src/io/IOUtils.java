package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOUtils {
	/*
	 * 读取指定文件内容   按照16进制 输出到控制台
	 * 每隔10个byte 换行
	 * */
	public static void printHex(String filename) throws IOException{
		FileInputStream in = new FileInputStream(filename);
		//把文件作为字节流进行读操作
		int b;
		int i =1 ;
		while((b =in.read())!=-1){
			//将整型转换为16进制表示的字符串
			System.out.println(Integer.toHexString(b)+"  ");
			if(i++%10==0){
				System.out.println();
			}
		}
		
		in.close();
	}
	 public static void printHexByArray(String filename)throws Exception{
		 FileInputStream in = new FileInputStream(filename);
		 byte[] buf =new byte[20*1024];
		 //从in中批量读取字节，放入buf字节数组中，
		 //从第0个开始放，最多放buf.length 个  返回的是读到的字节个数
		 int bytes =in.read(buf,0,buf.length);//一次性读完，说明字节数组足够大
		 int j=0;
		 for(int i =0;i<bytes;i++){
			 if(buf[i]<=0xf){
				 System.out.println("0");
			 }
			// System.out.println(Integer.toHexString(buf[i]+" "));
			 
		 }
		 
	 }
	
	
	
}



