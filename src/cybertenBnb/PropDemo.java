package cybertenBnb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import utilities.Config;

public class PropDemo {
public static void main(String[] args) throws IOException {
	
	System.out.println(Config.getProperty("url"));
	
	
//	String filePath = "./test.properties";
//	FileInputStream input = new FileInputStream(filePath);
//	Properties properties = new Properties();
//	properties.load(input);	
//	String firstValue = properties.getProperty("url");
//	System.out.println(firstValue);
}







}








