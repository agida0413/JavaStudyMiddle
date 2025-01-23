package com.yj.list;

public interface MyList  <E>{

    int size();

    void add();

    void add(int index,E e);

    E get(int index);

    E set(int index,E elemnet);

    E remove(int index);

    int indexOf(E o);

}
