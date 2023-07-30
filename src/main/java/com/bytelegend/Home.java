package com.bytelegend;

import com.bytelegend.pet.Cat;

import java.io.*;

public class Home {
    public Cat cat;

    public Home(Cat cat) {
        this.cat = cat;
    }

    public static void main(String[] args) {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = deepCopy(home);

        System.out.println(home.cat == deepCopy.cat);
    }



    // Deep copy the instance and return the deep copy of `home`
    public static Home deepCopy(Home home) {
        if (home == null) {
            return null;
        }

        Cat catCopy = new Cat(home.cat.name); // 创建一个新的Cat对象，并复制名称

        Home copy = new Home(catCopy); // 创建一个新的Home对象，并设置复制后的Cat对象
        return copy;
    }
}



