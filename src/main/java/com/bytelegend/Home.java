package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home implements Cloneable{
    public Cat cat;

    public Home(Cat cat) {
        this.cat = new Cat(cat.name);
    }

    public static void main(String[] args) {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = deepCopy(home);

        System.out.println(home.cat == deepCopy.cat);
    }

    // Deep copy the instance and return the deep copy of `home`
    public static Home deepCopy(Home home) {
    	Home temp;
		try {
            temp = (Home) home.clone();
            temp.cat = new Home(home.cat).cat;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return temp;
    }
}
