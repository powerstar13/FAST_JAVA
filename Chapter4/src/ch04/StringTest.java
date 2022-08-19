package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String"); // 풀네임을 써야 한다.

        // relection 프로그래밍
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
