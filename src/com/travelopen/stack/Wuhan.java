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
        users.add(new User(20,"张三"));
        users.add(new User(22,"李四"));
        users.add(new User(21,"王五"));
        users.add(new User(24,"钱六"));

        users.forEach((User user)-> System.out.println(user.toString()));

    }

    private static class User {
        int age;
        String name;

        public User(int age, String name) {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
