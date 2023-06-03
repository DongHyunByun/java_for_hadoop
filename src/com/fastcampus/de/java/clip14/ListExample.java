package com.fastcampus.de.java.clip14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        /* 리스트에는 ArrayList, LinkedList, Stack등이 있다*/
        //array list
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("size "+list.size());

        list.remove(0); //인덱스로 삭제
        System.out.println(list);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int cur : list) {
            System.out.println(cur);
        }

        // array
        int[] intArray = new int[5];
        intArray[0]=1;
        intArray[1]=100;

        int[] intArray2 = new int[5];
        intArray2[0]=intArray[0];
        intArray2[1]=intArray[1];
        intArray2[2]=intArray[2];
        intArray2[3]=11;
        intArray2[4]=2;

    }
}
