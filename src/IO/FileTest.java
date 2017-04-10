package IO;
import java.io.UnsupportedEncodingException;

//java是双字节编码，utf-16be

public class FileTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s ="1 AB你好";
		//中文占用3个字�?   英文占用1个字�?
		byte[] byte1 =s.getBytes("utf-8");
		for(byte b:byte1){
			//把字节转换成int  �?16进制的方式显�?
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		byte[] byte2 =s.getBytes("gbk");
		for(byte b:byte2){
			//把字节转换成int  �?16进制的方式显�?
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		byte[] byte3 =s.getBytes("utf-16be");
		for(byte b:byte3){
			//把字节转换成int  �?16进制的方式显�?
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		String str1 =new String(byte3);
		System.out.println(str1);
		String str2 = new String(byte3, "utf-16be");
		System.out.println(str2);
		String str3 = new String(byte1);
		System.out.println();
		
		
		
		
		
	}

}
