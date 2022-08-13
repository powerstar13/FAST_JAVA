package ch07;

public class UserTest {

    public static void main(String[] args) {

        // 기본 생성자를 이용하는 방식
        User userLee = new User();
        userLee.setUserId("a12345");
        userLee.setUserPassword("password12345");
        userLee.setUserName("Lee");
        userLee.setPhone("01012341234");
        userLee.setAddress("Seoul, Korea");

        System.out.println(userLee.showUserInfo());

        // 사용자 정의 생성자를 이용하는 방식
        User userKim = new User("b12345", "password12345", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}
