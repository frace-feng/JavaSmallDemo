package com.frs.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
        String nana=new String(" nan da ") ;
        String mama=nana.trim();//截取两边的空格
//        System.out.println(nana==mama);//  false
//        System.out.println(nana.equals(mama)); // true
//        nana.split("");
//        List list=Arrays.asList(nana.split(""));
//         Collections.reverse(list);
//         StringBuilder sb=new StringBuilder();
//        for (int i=0;i<list.size();i++){
//            sb.append(list.get(i));
//        }
//        System.out.println(sb.toString());
        System.out.println(mama.length()+","+nana.length());

    }
}