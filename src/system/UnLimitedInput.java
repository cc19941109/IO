package system;

import java.io.IOException;
import java.io.InputStream;

//注意 ：这个程序会出现中文乱码

public class UnLimitedInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputStream =System.in;
		StringBuffer stringBuffer =new StringBuffer();
		System.out.println("请输入数据：  ");
		int temp =0;
		while((temp=inputStream.read())!=-1){
			if(temp=='\n'){
				break;
			}
			stringBuffer.append((char)temp);
		}
		System.out.println("输入的内容是  "+stringBuffer);
		
	}

}
