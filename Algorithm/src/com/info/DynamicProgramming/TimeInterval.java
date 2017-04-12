package com.info;

import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ListIterator;
import java.lang.Object;
import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class TimeInterval extends Thread {
	volatile boolean flag = true;

	public void run() {
		// 1 way to read file
		/*
		 * while(flag) { try { FileReader fr=new
		 * FileReader("C:/Users/amar.agrahari/Desktop/abc.txt"); String i;
		 * BufferedReader br=new BufferedReader(fr);
		 * while((i=br.readLine())!=null) { System.out.println(i); }
		 * 
		 * } catch (FileNotFoundException e1) { e1.printStackTrace(); } catch
		 * (IOException e) {
		 * 
		 * e.printStackTrace(); } try{ Thread.sleep(5000); } catch(Exception e){
		 * 
		 * }
		 * 
		 * }
		 */

		// 2nd way to read file efficiently
		while (flag) {
			File fr = new File("C:/Users/amar.agrahari/Desktop/abc.txt");

			try {
				LineIterator it = FileUtils.lineIterator(fr, "UTF-8");

				while (it.hasNext()) {
					String line = it.nextLine();
					System.out.println(line);
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "oracle");

					CallableStatement stmt = con
							.prepareCall("{call insertuser(?,?)}");
					stmt.setString(1, line);
					stmt.setInt(2, 20);
					stmt.execute();
					System.out.println("Success");
					con.close();
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				Thread.sleep(50000);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {

		TimeInterval t = new TimeInterval();
		t.start();

	}

}
