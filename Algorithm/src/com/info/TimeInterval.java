package com.info;

import java.io.*;
import java.util.ListIterator;
import java.lang.Object;
import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.SuffixFileFilter;



public class TimeInterval extends Thread {
	volatile boolean flag = true;
	public void run() 
	{
		//1 way to read file
	/*    while(flag)
	    {    
	       try {
			FileReader fr=new FileReader("C:/Users/amar.agrahari/Desktop/abc.txt");
			String i;
			BufferedReader br=new BufferedReader(fr);
			while((i=br.readLine())!=null)
			{
				System.out.println(i);
			}
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	        try{
	            Thread.sleep(5000);
	        } catch(Exception e){

	        }

	    }*/
		
		//2nd way to read file efficiently
		while(flag)
		{
		File fr=new File("C:/Users/amar.agrahari/Desktop/abc.txt");
		 
		try {
			LineIterator it = FileUtils.lineIterator(fr,"UTF-8");
		
		    while (it.hasNext()) {
		        String line = it.nextLine();
		      System.out.println(line);
		    }
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try{
	            Thread.sleep(5000);
	        } catch(Exception e){

	        }
		}
	}
	public static void main(String[] args) {
  //The code in comment is to execute a code after particular interval
/*new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
        System.out.println("Hello World");
            }
        }, 
        5000
);*/
		
TimeInterval t=new TimeInterval();
t.start();
		
	}

}
