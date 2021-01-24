package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
		/*
		System.out.println("No of characters to be read = " + fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.read());
		System.out.println("No of characters to be read = " + fin.available());
		*/
		
		/*
		//read file contents character-by-character
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			n = fin.read();
			Thread.sleep(100); //100ms
		}
		*/
		
		/*
		//read file contents completely
		//-- create a byte array with size of file
		byte[] b = new byte[fin.available()];  
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		//to read file contents line-by-line
		InputStreamReader inReader = new InputStreamReader(fin); //to convert byte stream to character stream
		BufferedReader br = new BufferedReader(inReader);
		String str = br.readLine();
		while(str != null) {
			System.out.println(str);
			str = br.readLine();
			Thread.sleep(2000);
		}
		
		fin.close();
		br.close();
	}
}
