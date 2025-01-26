package com.yj.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();

        List<Object> objects = Collections.emptyList();

        Integer arr[] = new Integer[3];

        List<Integer> list = Arrays.asList(arr);
    }
}
