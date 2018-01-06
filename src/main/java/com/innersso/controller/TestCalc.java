package com.innersso.controller;

import java.util.TreeSet;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午1:24 2017/12/29
 * @Description:
 */
public class TestCalc {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();

        String sourceStr = "时光清浅，新的一天总会如约而至。白云轻轻的飘着，清清的河水静静地流淌着，大地在一片萧瑟中整装待发，孕育着新的生机。人间有爱，岁月沉香。爱，是流淌在心底的清溪，无声的滋润着我们单薄的心。爱是一句温暖的话语，是一份思念，是缤纷绚烂时的热烈";
        TreeSet<String> sortTargetStr = new TreeSet<>();
        for (int i = sourceStr.length() - 1; i >= 0 ; i--) {
            String subStr = sourceStr.substring(i);
            sortTargetStr.add(subStr);
        }

        Thread thread = new Thread(){
            public void run(){
                for (String str : sortTargetStr) {
                    System.out.println(str);
                }
            }
        };
        thread.start();

//        System.out.println(sortTargetStr);

        Long end = System.currentTimeMillis();
        System.out.println("花费时间:" + (end - start) + "strlen:" + sourceStr.length());
    }
}
