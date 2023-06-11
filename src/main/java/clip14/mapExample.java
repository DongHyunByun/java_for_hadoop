package com.fastcampus.de.java.clip14;

import java.util.HashMap;
import java.util.Map;

public class mapExample {
    public static void main(String[] args) {
        /*map에는 hashmap, treemap 등이 있다,*/

        // map 정의 및 추가
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2,"barry");
        map.put(2,"cherry");
        map.put(100,"pineapple");
        System.out.println(map);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("first","apple");
        stringMap.put ("Second","berry");
        System.out.println(stringMap);

        // 없으면 추가
        stringMap.putIfAbsent("Second","blackBerry");
        stringMap.putIfAbsent("third","watermelon");
        System.out.println(stringMap);

        // 키가 있는지 값이 있는지 확인할 것
        System.out.println(stringMap.containsKey("first"));
        System.out.println(stringMap.containsKey("fourth"));
        System.out.println(stringMap.containsValue("apple"));
        System.out.println(stringMap.containsValue("peach"));

        // 키,값 확인
        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());
        for (String key : stringMap.keySet()) {
            System.out.println(key + " " + stringMap.get(key));
        }

        stringMap.remove("first","apple");
        System.out.println(stringMap);

    }


}
