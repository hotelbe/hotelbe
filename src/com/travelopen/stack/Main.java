package com.travelopen.stack;



import java.util.ArrayList;
import java.util.List;

/**
 * @project: helloworld
 * @auther: shiwei
 * @date: 2018/11/16 12:39
 * @description: TODO
 */
public class Main {
    private static int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] space1 = new byte[_1MB*12];
        byte[] space2 = new byte[_1MB*8];
        byte[] space3 = new byte[_1MB*4];
        byte[] space4 = new byte[_1MB*4];


        List<User> users = new ArrayList<>();
        users.add(new User(20, "张三"));
        users.add(new User(22, "李四"));
        users.add(new User(21, "王五"));
        users.add(new User(24, "钱六"));

        users.forEach((User user) -> System.out.println(user.toString()));

        // for (int i = 0; i < users.size(); i++) {
        //     User user = users.get(i);
        //     System.out.println(user.toString());
        // }
    }
}
