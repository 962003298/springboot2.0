package com.springboot2.itmq.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDome {
    public static void main(String[] args) {
        List<String> list2 =new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        //list的三种遍历方式
        //第一种 for
        for (int i=0;i<list2.size();i++){
            String a= list2.get(i);
            System.out.println("第一种 for"+a);
        }
        //第二种 for增强
        for (String b:list2){
            System.out.println("第二种 for增强"+b);
        }
        //第三种  迭代器
        Iterator<String> iterator=list2.iterator();
          while (iterator.hasNext()){
              System.out.println("第三种迭代器"+iterator.next());
          }
          list2.get(6);
    }


}
