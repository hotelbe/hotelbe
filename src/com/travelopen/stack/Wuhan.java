package com.travelopen.stack;


import java.util.ArrayList;
import java.util.List;

/**
 * @project: helloworld
 * @auther: shiwei
 * @date: 2018/11/16 22:06
 * @description: TODO
 */
public class Wuhan {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
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
