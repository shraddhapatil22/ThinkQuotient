package array;
import java.io.*;
import java.util.*;



	 
	public class Main extends Thread {
	      
	    public void run()
	    {
	        System.out.println("Thread Started Running...");
	    }
	    public static void main(String[] args)
	    {
	        Main g1 = new Main();
	        g1.start();
	    }
	}
