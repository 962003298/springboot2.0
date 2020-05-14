package com.springboot2.itmq.text;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/**
 * 斗地主案例
 * 1.准备排
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 */
public class DouDiZhu {
    public static <list> void main(String[] args) {
        //1.准备牌
        List<String> list = new ArrayList<String>();
        String[] ys = {"♠", "♣", "♦", "♥"};
        String[] sz = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        list.add("大王");
        list.add("小王");
        for (String a : ys) {
            for (String b : sz) {
                list.add(a + b);
            }
        }
        System.out.println("新牌：" + list);
        //2.洗牌 Collections 类中的shuffle方法可以打乱集合中的顺序
        Collections.shuffle(list);
        System.out.println("洗牌后的牌：" + list);
        //3.发牌
        List<String> dp = new ArrayList<String>();
        List<String> nm1 = new ArrayList<String>();
        List<String> nm2 = new ArrayList<String>();
        List<String> dz = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                dp.add(list.get(i));
            } else if (i % 3 == 0) {
                nm1.add(list.get(i));
            } else if (i % 3 == 1) {
                nm2.add(list.get(i));
            } else if (i % 3 == 2) {
                dz.add(list.get(i));
            }
        }
        
        //4.看牌
        System.out.println("底牌："+dp);
        System.out.println("农民1："+nm1);
        System.out.println("农民1："+nm2);
        System.out.println("地主："+dz);

    }

}
