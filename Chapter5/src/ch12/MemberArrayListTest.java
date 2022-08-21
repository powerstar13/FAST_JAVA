package ch12;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberList.addMember(memberLee);
        memberList.addMember(memberKim);
        memberList.addMember(memberKang);
        memberList.addMember(memberHong);

        memberList.showAllMember();

        memberList.removeMember(memberHong.getMemberId());
        memberList.showAllMember();

    }
}
