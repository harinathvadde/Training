package de.zeroco.files;

import java.io.*;
import java.util.Scanner;

public class CreatingFile {

	/**
	 * This method is used to create file
	 * @author HARINATH
	 * @since 02/12/2022
	 * @return
	 */
	public static String creatFile(String filename) {
		try {
			File myfile = new File(filename);
			if(myfile.createNewFile()) {
				return "File is created";
			} else {
				return "file already exists";
			}
		} catch (Exception e) {
			return "" + e;
		}
	}
	/**
	 * This method is for knowing different methods available in file 
	 * @author HARINATH
	 * @since 02/12/2022
	 */
	public static void fileMethods(String filename) {
		File myfile = new File(filename);
		if (myfile.exists()) {
			System.out.println(myfile.getName());
			System.out.println(myfile.getAbsolutePath());
			System.out.println(myfile.length());
			System.out.println(myfile.canRead());
			System.out.println(myfile.canWrite());
		} else {
			System.out.println("file doesnot exists");
		}
	}
	
	/**
	 * This method used to add data to file
	 * @author HARINATH
	 * @since 02/12/2022
	 * @return
	 */
	public static String writeData(String filename) {
		try {
			FileWriter mydata = new FileWriter(filename);
			mydata.write("harinath");
			mydata.close();
			return "Successfylly updated";
		} catch (Exception e) {
			return "" + e;
		}
	}
	/**
	 * This method used to write data in file
	 * @author HARINATH
	 * @since 05/12/2022
	 * @return
	 * @throws IOException 
	 */
	public static String fileWrite(String filename,String data ) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename)); 
		try {
			writer.write(data + "\n");
			writer.flush();
			writer.close();
			return "write file completed";
		} catch (Exception e) {
			return "" + e;
		} finally {
			writer.close();
		}
	}
	/**
	 * This method used to reade data in file
	 * @author HARINATH
	 * @since 05/12/2022
	 * @return
	 */
	public static String readFile(String filename) {
		String res = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) 
				res += line + "\n";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
}

