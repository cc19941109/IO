package IO;
import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.appender.rolling.SizeBasedTriggeringPolicy;

public class FileUtils {
	/**
	 * 
	 * @category  列出指定目录下包括子目录的所有文�?
	 * @author chengchen2
	 * @date Apr 10, 2017
	 * @time 12:52:26 PM
	 * @para 
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir)throws Exception{
		if(!dir.exists()){
			throw new IllegalAccessException("目录"+dir+"不存�?");
		}
		if(!dir.isDirectory()){
			throw new IllegalAccessException(dir+"不是目录");
		}
//		String[] fileNames =dir.list();//返回字符串数�?
//		for(String string :fileNames){
//			System.out.println(dir +"\\"+string);
//		}
//		
		//遍历子目录下的内�?,构�?�file对象做�?�归操作
		//file提供了直接返回file对象的api
		File[] files =dir.listFiles();//返回直接子目录的抽象
		if(files!=null&&files.length>0){
			for(File file :files){
				if(file.isDirectory()){
					//递归
					listDirectory(file);
					
				}else{
					System.out.println(file);
				}
			}
			
		}
		
		
	}
}








