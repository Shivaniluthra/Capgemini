package com.javalabbook.lab9;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task extends Thread {
	public void run() {
		System.out.println("Date: "+new Date());
		
	}
}
public class Multithreading {
	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.scheduleWithFixedDelay(new Task(), 0, 10, TimeUnit.SECONDS);
		
		service.awaitTermination(42, TimeUnit.SECONDS);
		service.shutdownNow();
	}

}
