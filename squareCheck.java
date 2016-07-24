package javaapplication21;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class squareCheck {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	    String s;
    	    int a[] = new int[2];
    	      int b[] = new int[2];
    	      int c[] = new int[2];
    	      int _d[] = new int[2];
    	      int _counter =0;
    	      int acounter = 0, bcounter = 0, ccounter=0, dcounter=0;

    	      
    	//      System.out.pritln();
    	    while ((s = in.readLine()) != null) {
    	    
    	  

                
    	      s = s.replace("(","");
      	      s = s.replace(")","");
      	    s = s.replace(" ","");
      	      s = s.replace(","," ");
//      	      s = "";
      	      System.out.println(s);
      	      String[] strArray = s.split(" ");
      	      
      	      int x1 = Integer.parseInt(strArray[0]);
    	      int y1 = Integer.parseInt(strArray[1]);
    	      int x2 = Integer.parseInt(strArray[2]);
    	      int y2 = Integer.parseInt(strArray[3]);
    	      int x3 = Integer.parseInt(strArray[4]);
    	      int y3 = Integer.parseInt(strArray[5]);
    	      int x4 = Integer.parseInt(strArray[6]);
    	      int y4 = Integer.parseInt(strArray[7]);
    	      
    	      double d[] = new double[6];

    	        d[0] = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    	        d[1] = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    	        d[2] = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
    	        d[3] = Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
    	        d[4] = Math.sqrt(Math.pow(x2 - x4, 2) + Math.pow(y2 - y4, 2));
    	        d[5] = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

//    	        System.out.println(d1);
//    	        System.out.println(d2);
//    	        System.out.println(d3);
//    	        System.out.println(d4);
//    	        System.out.println(d5);
//    	        System.out.println(d6);

    	        int counter = 0;
    	        int count1 = 0;
    	        for (int i = 0; i < 3; i++) {
    	            counter = 0;
    	            for (int j = 0; j < 6; j++) {
    	                if (i == j)
    	                    continue;

    	                if (d[i] == d[j])
    	                    counter++;

    	                if (counter == 3)
    	                    break;

    	                if (counter < 3 && j == 5)
    	                    break;
    	            }
    	        }

    	        if (counter == 3)
    	            System.out.println("true");
    	        else
    	        	System.out.println("false");
    	       
 
    	    }
    	        
    }
}

//(6,9),(9,6),(4,6),(6,4)
