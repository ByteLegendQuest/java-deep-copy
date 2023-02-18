package com.bytelegend;

import com.bytelegend.pet.Cat;

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
        Home obj = null;
        try {
            // 将对象写成 Byte Array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(from);
            out.flush();
            out.close();
 
            // 从流中读出 byte array，调用readObject函数反序列化出对象
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray()));
            obj = in.readObject();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        return obj;
    }
}
