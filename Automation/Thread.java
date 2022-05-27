package array;
import java.io.*;
import java.util.*;
	 
	public class Thread implements Runnable {
	      
	    public void run()
	    {
	        System.out.println(
	            "Thread is Running Successfully");
	    }
	 
	    public static void main(String[] args)
	    {
	        Thread t1 = new Thread();
	        Thread t1 = new Thread();
	        t1.start();
	    }

			
		}