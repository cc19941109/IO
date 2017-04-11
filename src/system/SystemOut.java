package system;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OutputStream outputStream =System.out;
		outputStream.write("hello world".getBytes());
		
		
	}

}
