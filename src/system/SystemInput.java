package system;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.IntPredicate;

public class SystemInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputStream = System.in;
		byte data[] =new byte[1024];
		System.out.println("请输入数据");
		int len =inputStream.read(data);
		System.out.println("输入的是  "+new String(data,0,len));
		//System.out.println("输入的是  "+new String(data));
	}

}
