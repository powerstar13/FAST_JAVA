package ch07;

public class User {

    private String userId; // 회원 아이디
    private String userPassword; // 비밀번호
    private String userName; // 이름
    private String address; // 주소
    private String phone; // 연락처

    public User() {}

    public User(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String showUserInfo() {
        return String.format("고객님의 아이디는 %s이고, 등록된 이름은 %s입니다.", userId, userName);
    }
}
