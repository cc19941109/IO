package io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/*		// TODO Auto-generated method stub
randomAccessFile  java提供的对文件内容的访问   读取  写入
 支持随机访问文件  
java文件模式   byte byte  byte
rw   r 
文件指针，打开文件时   指针在开头 point=0；
randomAccessFile randomAccessFile =new randomAccessFile(File,"rw");

raf.write(int)  只写一个自己，同时指针指向下一个位置
int a =raf.read()  读一个字节
文件读写 完成以后  一定要关闭  
*/	
		
public class randomAccessFile {

	public static void main(String[] args) throws IOException {
		File demo =new File("demo");
		if(!demo.exists()){
			demo.mkdirs();
		}
		File file =new File(demo,"raf.dat");
		if(!file.exists()){
			file.createNewFile();	
		}
		RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
		System.out.println(randomAccessFile.getFilePointer());
		
		randomAccessFile.write('a');//只写了一个字节  后8位
		System.out.println(randomAccessFile.getFilePointer());
		randomAccessFile.write('b');//只写了一个字节
		System.out.println(randomAccessFile.getFilePointer());
		
		int i= 0x7fffffff;
		//用write方法每次只能写一个字节，如果要把写进去  要写4次
		randomAccessFile.write(i>>>24);//高8位
		randomAccessFile.write(i>>>16);

		randomAccessFile.write(i>>>8);

		randomAccessFile.write(i);
		System.out.println(randomAccessFile.getFilePointer());
		
		randomAccessFile.writeInt(i);
		System.out.println(randomAccessFile.getFilePointer());
		String string ="中古";
		byte[] gbk =string.getBytes();
		randomAccessFile.write(gbk);
		System.out.println(randomAccessFile.getFilePointer());
	
		System.out.println(randomAccessFile.length());
		//读文件
		//把指针移动到头部
		randomAccessFile.seek(0);
		byte[] buf = new byte[(int)randomAccessFile.length()];
		randomAccessFile.read(buf);
		System.out.println(Arrays.toString(buf));
		String s1 =new String(buf, "utf-8");
		System.out.println(s1);
		
	}

}


















