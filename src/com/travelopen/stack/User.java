package com.travelopen.stack;

/**
 * @project: helloworld
 * @auther: shiwei
 * @date: 2018/11/29 14:52
 * @description: TODO
 */
public class User {

    int age;
    String name;

    public User(int age, String name) {
        this.age=age;
        this.name=name;
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