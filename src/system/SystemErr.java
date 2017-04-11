package system;


/*
 * system中有三个IO常量
 *  err  out   in 
 *  
 * 
 * 
 * */
public class SystemErr {

	public static void main(String[] args) {
		
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.err.print(e);
		}
		
		
		
	}

}
