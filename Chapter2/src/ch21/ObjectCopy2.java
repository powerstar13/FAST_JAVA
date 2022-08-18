package ch21;

public class ObjectCopy2 {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        // 객체를 생성하여 각 배열의 요소로 저장하기
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // 깊은 복사
        for (int i = 0; i < library.length; i++) {
            copyLibrary[i] = new Book(library[i].getTitle(), library[i].getAuthor());
        }

        System.out.println("===== library =====");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("===== copy library =====");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("===== library =====");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("===== copy library =====");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
