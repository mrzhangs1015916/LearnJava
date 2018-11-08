package com.zs.type;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapLearn {
    public static void main(String[] args){
        System.out.println("map");
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("zs",20);
        map.put("zd",30);
        System.out.println(map.containsKey("zs"));
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
