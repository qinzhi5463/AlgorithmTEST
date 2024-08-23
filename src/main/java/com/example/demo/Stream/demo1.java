package com.example.demo.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("apple", "fig", "banana", "kiwi");
//        List<String> filteredList = new ArrayList<>();
//
//        for (String item : originalList) {
//            if (item.length() > 3) {
//                filteredList.add(item);
//            }
//        }
//
//        System.out.println(filteredList);

//        List<String> filteredList = originalList.stream()
//                .filter(s -> s.length() > 3).collect(Collectors.toList());
//        System.out.println(filteredList);

        Map<Integer, String> demo1 = new HashMap<>();
        demo1.put(1, "app");
        demo1.put(2, "app2");
        demo1.put(3, "app3");

        for (Map.Entry<Integer, String> entry : demo1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


    }


}
