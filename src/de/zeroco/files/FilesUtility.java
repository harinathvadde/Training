package de.zeroco.files;

import de.zeroco.assignment.Utility;
import java.io.*;

public class FilesUtility {
	/**
	 * This method used to create the files if its not already created
	 * @author HARINATH
	 * @since 05/12/2022
	 * @param filePath
	 * @return file
	 * @throws Exception
	 * @exception IOException
	 */
	public static File getFile(String filePath) {
		if (Utility.isBlank(filePath)) {
			return null;
		}
		File myFile = new File(filePath);
		try {
			if (myFile.exists()) {
				if (myFile.isDirectory()) {
					throw new Exception("It is a Directory");
				}
				return myFile;
			} else {
				myFile.createNewFile();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return myFile;
	}

	/**
	 * This method used to write data in file
	 * @author HARINATH
	 * @since 05/12/2022
	 * @return
	 * @throws Exception
	 */
	public static File fileWrite(String filePath, String data) {
		if (Utility.isBlank(filePath) && Utility.isBlank(data))
			return null;
		File myFile = getFile(filePath);
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(myFile));
			writer.write(data);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myFile;
	}
	/**
	 * This method will add the data without distrubing the old data
	 * @author HARINATH
	 * @since 05/12/2022
	 * @param filePath
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static File fileAppend(String filePath, String data) {
		if (Utility.isBlank(filePath) && Utility.isBlank(data))
			return null;
		File myFile = getFile(filePath);
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(myFile, true));
			writer.newLine();
			writer.write(data);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myFile;
	}
	/**
	 * This method used to reade data in file
	 * @author HARINATH
	 * @since 05/12/2022
	 * @return
	 * @throws Exception
	 */
	public static String [] readFile(String filePath) {
		if (Utility.isBlank(filePath)) {
			return null;
		}
		String res = "";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			while ((line = reader.readLine()) != null) {
				res = res + "\n" + line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res.split(",");
	}
	/**
	 * This method will return the file with removed data
	 * @author HARINATH
	 * @since 06/12/2022
	 * @param filePath
	 * @param removeData
	 * @return
	 * @throws IOException
	 */
	public static File removeData(String filePath, String removeData) {
		if (Utility.isBlank(filePath) && Utility.isBlank(removeData)) {
			return null;
		}
		int line = 1;
		int lineNo = 0;
		File tempFile = getFile("temprary.csv");
		File myFile = getFile(filePath);
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(myFile));
			writer = new BufferedWriter(new FileWriter(tempFile));
			String temp = null;
			while ((temp = reader.readLine()) != null) {
				String[] details = temp.split(",");
				for (String data : details) {
					if (data.equalsIgnoreCase(removeData)) {
						lineNo = line;
						break;
					}
				}
				if (lineNo != line) {
					writer.write(temp);
					writer.newLine();
				}
				line++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				writer.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		myFile.delete();
		tempFile.renameTo(myFile);
		return myFile;
	}
	
}
