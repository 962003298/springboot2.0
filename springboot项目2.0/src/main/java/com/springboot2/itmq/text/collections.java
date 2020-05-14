package com.springboot2.itmq.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合里面插入一些元素
        Collections.addAll(list,"3","4","1","2");
        System.out.println(list);
        //打乱集合的顺序
        Collections.shuffle(list);
        System.out.println(list);
        //排序升序
        Collections.sort(list);
        System.out.println(list);

    }
}
