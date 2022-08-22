package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            // main에서는 throws를 하면 vm으로 가서 시스템의 치명적인 에러를 일으키므로 try-catch로 예외 처리해야 함
            test.loadClass("a.txt", "abc"); // file이 없거나, class를 찾지 못할 경우 ERROR
//            test.loadClass("a.txt", "java.lang.String"); // file이 존재할 경우 class도 정상적으로 수행
        }
        catch (FileNotFoundException | ClassNotFoundException e) { // multi exception handling
            System.out.println(e);
        }
        catch (Exception e) { // default Exception은 catch 구문들 중 제일 아래에 작성되어야 한다.
            System.out.println(e);
        }

        System.out.println("end");
    }

    // throws는 예외 처리를 미루겠다는 뜻이다. (이 메서드를 사용하는 쪽에서 핸들링을 할 것이다.)
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }
}
