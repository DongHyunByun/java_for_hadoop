package com.fastcampus.de.java.clip14;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {
        /*set에는 hashset, treeset 등이 있다,*/

        //추가
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(1);
        integerSet.add(2);
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New york");
        stringSet.add("lasvagas");
        System.out.println(stringSet);

        // 삭제
        stringSet.remove("LA");
        System.out.println(stringSet);

        // 여러개 삭제
        List<String> removeTarget = new ArrayList<>();
        removeTarget.add("LA");
        removeTarget.add("New york");
        stringSet.removeAll(removeTarget);
        System.out.println(stringSet);

        // 포함여부 확인
        System.out.println("exist LA) " + stringSet.contains("lasvagas"));


    }
}
