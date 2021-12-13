package com.bytelegend;

import com.bytelegend.pet.Cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = Home.deepCopy(home);
        Assertions.assertFalse(home.cat == deepCopy.cat);
    }
}
