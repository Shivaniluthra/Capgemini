package com.javalabbook.lab8;

import java.io.*;

class FileEx extends Thread{
	
	
	public void run() {
		InputStream fis=null;
		OutputStream fos=null;
		try {
			String inputpath= "D:/somedir/source.txt";
			File file=new File(inputpath);
			String outputpath= "D:/somedir/target.txt";
			File ofile=new File(outputpath);
			fis = new FileInputStream(file);
			fos=new FileOutputStream(ofile);
			int read=0,size=0;
			
			while((read=fis.read())>0) {
				size++;
				System.out.println(size);
				if(size==10) {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
					size=0;
				}
				fos.write(read);
				
			}
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
		}
	}
}	
public class CopyDataThread {
	public static void main(String[] args)  {
			FileEx cd = new FileEx();
			cd.start();
		//	Thread.sleep(5000);
		}	
}
