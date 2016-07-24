/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

/**
 *
 * @author dhaval
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class randomnumber {
    public static void main(String[] args){
             Set<Integer> uniqueWords = new HashSet<>();
    
    Random rn = new Random();
// generates a random int
		int n = rn.nextInt( Integer.MAX_VALUE ) + 1;;
                System.out.println("I am n " +n);
		

		//System.out.println();
for(int i =0; i < 5; i++)
{
    int m = rn.nextInt(5);
    System.out.println("I am m"+m);
    uniqueWords.add(m);
  //  System.out.println(m);
}
System.out.println("Random number are" + uniqueWords);
}
}
