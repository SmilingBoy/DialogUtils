package com.smile;

import com.smile.zqdialog.BottomItem;

/**
 * @author Smile
 * @date 2017/12/15
 */

public class User implements BottomItem{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getItemText() {
        return getName();
    }
}
