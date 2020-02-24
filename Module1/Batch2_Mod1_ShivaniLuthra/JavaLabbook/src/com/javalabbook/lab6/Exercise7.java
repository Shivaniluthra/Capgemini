package com.javalabbook.lab6;

import java.io.*;
import java.util.*;

public class Exercise7 {
	 public static void main(String args[])
	 {
	 File f=new File("D:/somedir/new.txt");
	 System.out.println("name :"+f.getName());
	 System.out.println("path:"+f.getAbsolutePath());
	 System.out.println("exists:"+f.exists());
	 System.out.println("is file:"+f.isFile());
	 System.out.println("is dir:"+f.isDirectory());
	 System.out.println("read :"+f.canRead());
	 System.out.println("write:"+f.canWrite());
	 System.out.println("length in bytes:"+f.length()); 
	 }
	 
}
