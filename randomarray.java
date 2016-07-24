/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author dhaval
 */
public class randomarray {
    

public static void main(String[] args){
             Set<Integer> uniqueWords = new HashSet<>();
int[] a = {1,2,3,4,5,};    
    Random rn = new Random();
// generates a random int
		

		//System.out.println();
for(int i =0; i < a.length; i++)
{
    int m = rn.nextInt(a.length);
    for(int p=0;p<=m;p++)
    System.out.println("I am m"+a[m]);
    uniqueWords.add(a[m]);
  //  System.out.println(m);
}
//System.out.println("Random number are" + math.randomuniqueWords);
final int[] ints = new int[uniqueWords.size()];
    final Iterator<Integer> iter = uniqueWords.iterator();
    for (int i = 0; iter.hasNext(); ++i) {
        ints[i] = iter.next();
    }
    System.out.println(Arrays.toString(ints));
}
}

