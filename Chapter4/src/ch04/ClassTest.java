package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("ch04.Person");

        // new 키워드와 같은 newInstnace 메서드
        Person person = (Person) c1.newInstance(); // newInstance() --> @Deprecated
        person.setName("Lee");

        System.out.println(person);

        Class c2 = person.getClass();
        // default construnctor를 사용해서 인스턴스 생성
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes = { String.class };
        Constructor constructor = c2.getConstructor(parameterTypes);
        Object[] initArgs = { "Kim" };
        // 파라미터를 받는 생성자를 사용하여 인스턴스 생성
        Person kimPerson = (Person) constructor.newInstance(initArgs);
        System.out.println(kimPerson);

        // 내가 Person 정보를 모를 때 사용하는 방법이다.
    }
}
