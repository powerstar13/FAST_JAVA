package ch20;

public class CharArrayTest {

    public static void main(String[] args) {

        char[] alpahbets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alpahbets.length; i++) {
            alpahbets[i] = ch++;
        }

        for (char alpahbet : alpahbets) {
            System.out.printf("%s, %d\n", alpahbet, (int) alpahbet);
        }
    }
}
