package io;


/*
 * 字节流   
 * 1、	inputstream  outputstream   
 * 		抽象了应用程序读、写数据的方式
 * 2、  EOF =END   读到-1  就读到结尾
 * 3、输入流
 * int b = in.read();读取一个字节  无符号填充到int的低八位   -1为EOF
 * in.read(byte[] buf) 读取数据填充到字节数组buf中
 * in.read(byte[] buf ,int start,int size)
 * 输出流
 * out.write(int b )   写出一个byte  到流   ，b的低八位
 * out.write(byte[] buf) 将字节数组buf都写入流
 * out.write(byte[] buf ,int start,int size)
 * 
 * 	FileInputStream  具体实现了在文件中读取数据
 * 
*/
public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
