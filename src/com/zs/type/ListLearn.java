package com.zs.type;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLearn {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        int N=100000;
        long time=System.currentTimeMillis();
        for(int i=0;i<N;i++){
            list.add(i);
        }
        System.out.println(System.currentTimeMillis()-time);
        time=System.currentTimeMillis();
        for(int i=0;i<N;i++){
            list2.add(i);
        }
        System.out.println(System.currentTimeMillis()-time);
        System.out.println(list.get(1));
    }
}
