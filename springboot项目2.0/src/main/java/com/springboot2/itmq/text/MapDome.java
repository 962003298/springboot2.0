package com.springboot2.itmq.text;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDome {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        map.put("张三", "15");
//        map.put("李四", "23");
//        map.put("重地", "44");
//        map.put("通话", "11");
//        Boolean bool = map.containsValue("w");
//        System.out.println(bool);
//        Set<String> set = map.keySet();
//        //for循环增强
//        for (String a : map.keySet()) {
//            String s = map.get(a);
//            System.out.println(s);
//        }
//        //迭代器
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            String s = map.get(next);
//            System.out.println(s);
//        }
//        //使用entry遍历集合
//        //entry加迭代器遍历
//        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
//        while (iterator1.hasNext()){
//            Map.Entry<String, String> next = iterator1.next();
//            System.out.println("key:"+next.getKey()+"value:"+next.getValue());
//
//        }
//        //for循环遍历
//        for (Map.Entry<String, String> map2 : map.entrySet()){
//
//            System.out.println("key:"+map2.getKey()+"|"+"value:"+map2.getValue());
//        }
//        //for只能遍历value 不能得到key
//        for(String v:map.values()){
//            System.out.println("value:"+v);
//        }
        add(10,12);
    }
     //可变参数
    private static int add(int...arr) {
        int sum=0;
         for (int a:arr){
            sum += a;
         }
        System.out.println(sum);
        return 0;
    }

}
