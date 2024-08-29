package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("anurag");
        l.add(100);
        l.add(200);
        l.add(null);

        ListIterator itr = l.listIterator();        
        System.out.println("Iterating forward");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // itr.next();
        // itr.next();
        // itr.next();
        // itr.next();
        System.out.println("----------------------------");
        
        System.out.println("Iterating backward:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }   
        //itr.add(300);
        //System.out.println(l);    
        itr.set(101);  
        System.out.println(l);
    }
}
