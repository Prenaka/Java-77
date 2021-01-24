package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth";
		byte[] data = str.getBytes();
		fout.write(data);
		System.out.println("File Saved!");
		
		FileWriter fWriter = new FileWriter("src/co/edureka/io/edureka1.txt");
		fWriter.write(str);
		System.out.println("Second File also Saved!");
		fout.close();
		fWriter.close();
	}
}
