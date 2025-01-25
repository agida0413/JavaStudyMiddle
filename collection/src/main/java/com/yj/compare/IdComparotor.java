package com.yj.compare;

import java.util.Comparator;

public class IdComparotor implements Comparator<Myuser> {

    @Override
    public int compare(Myuser o1, Myuser o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
