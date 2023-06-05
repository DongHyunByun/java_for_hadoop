package com.fastcampus.de.java.clip17;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        String[] arr = {"데이터를","배우는","가장많은"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(param -> System.out.println(param+" "));

        System.out.println();

    }
}
