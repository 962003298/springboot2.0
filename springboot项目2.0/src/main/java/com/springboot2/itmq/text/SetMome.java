package com.springboot2.itmq.text;

import java.util.HashSet;
import java.util.Iterator;

public class SetMome {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //迭代器遍历
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //增强for循环遍历
        for(int a:set){
            System.out.println(a);
        }
    }
}
