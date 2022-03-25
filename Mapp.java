package com.company;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Mapp
{
    public static void main(String[] args) 
	{
        Map<String, String> m1 = new TreeMap<String, String>();
        m1.put("ABC", "DEF");
        m1.put("MNO", "PQR");
        m1.put("XYZ", "UVW");
        m1.put("STU", "GHI");

        System.out.println("By Using Key Set");
        Set<String> keySet = m1.keySet();
        for(String key : keySet)
	      {
            System.out.println(key+" "+m1.get(key));
        }

     }
}
