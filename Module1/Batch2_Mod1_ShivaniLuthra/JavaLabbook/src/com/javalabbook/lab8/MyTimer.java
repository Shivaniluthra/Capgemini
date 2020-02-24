package com.javalabbook.lab8;

import java.util.*;
import java.util.TimerTask;


public class MyTimer implements Runnable {

    @Override
    public void run() {
       for(int i=0;i<10;i++) {
    	   System.out.println("Started: "+new Date());
           try {
           	Thread.sleep(10000);
           }
           catch(InterruptedException e) {
           	e.printStackTrace();
           }
       }
    }
    public static void main(String[] args) {
    	MyTimer mt = new MyTimer();
    	Thread t = new Thread(mt);
    	t.start();
    //	t.start();			throws IllegalThreadStaticException
    }

}
