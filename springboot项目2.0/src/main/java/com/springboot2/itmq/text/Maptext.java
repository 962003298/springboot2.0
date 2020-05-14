package com.springboot2.itmq.text;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maptext {
    public static void main(String[] args) {
        //友情提示
        System.out.println("输入一个字符串");
        String line = new Scanner(System.in).nextLine();
        show(line);
    }

    private static void show(String line) {

        Map<Character, Integer> map = new HashMap<>();

        for (char chars:line.toCharArray()) {

            if (map.size() == 0) {

                map.put(chars, 1);
            } else {
                if (!map.containsKey(chars)) {
                    map.put(chars, 1);
                } else {
                    int a = map.get(chars);
                    a++;
                    map.put(chars, a);
                }
            }


        }
        System.out.println(map);

    }
}
