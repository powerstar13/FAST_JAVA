package ch08;

public class MemberTest {

    public static void main(String[] args) {

        Member member = new Member("Tomas", 37, Member.Gender.M, 180, 78);

        System.out.println(member.getMemberInfo());
    }
}
