package com.yj.compare;

import java.util.Comparator;

public class Myuser implements Comparable<Myuser> {
    private String id;

    @Override
    public int compareTo(Myuser o) {
 return     this.age < o.age ? -1 : (this.age ==o.age?0:1);
    }

    @Override
    public String toString() {
        return "Myuser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;

    public Myuser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}
