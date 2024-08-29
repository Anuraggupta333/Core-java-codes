package com.Collection;

import java.util.Map;
import java.util.HashMap;
public class mapdemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(101,"Anurag");
        map.put(102, "appu");
        map.put(103, "Anurag");
        map.put(103, "puneet"); //override key
        map.put(null, null);
        System.out.println(map);
        System.out.println(map.containsValue("appu"));
        System.out.println(map.get(101));
        System.out.println(map.containsKey(102));
    }
}
