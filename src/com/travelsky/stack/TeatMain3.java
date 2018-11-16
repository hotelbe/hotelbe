package com.travelsky.stack;

/**
 * @project: helloworld
 * @auther: shiwei
 * @date: 2018/11/16 13:49
 * @description: TODO
 */
public class TeatMain3 {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            byte[] space = new byte[512];
        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);

    }
}
