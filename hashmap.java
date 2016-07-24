/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dhaval
 */
public class hashmap {
    public static void main(String[] args)
    {
        HashMap a = new HashMap();
        a.put(1, "Dhaval");
        a.put(2,"Shah");
        Set set = a.entrySet();
        //System.out.println(a);
        Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
                a.remove(2);
                System.out.println(a);
    }
    
}
