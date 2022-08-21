package ch14.comparable;

import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        // String 클래스에는 Comparable이 이미 구현되어 있으므로 꺼낼 때 정렬되어 나온다.
        TreeSet<String> set = new TreeSet<>();
        set.add("홍길동");
        set.add("강감찬");
        set.add("이순신");

        System.out.println(set); // [강감찬, 이순신, 홍길동] 정렬되어 나온다.

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();
    }
}
