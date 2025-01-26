package com.yj.utils;

public class Member implements Comparable<Member>{
    @Override
    public int compareTo(Member o) {
        return this.age < o.age ? 1:(this.age == o.age?0:-1);
    }

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private int id;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
