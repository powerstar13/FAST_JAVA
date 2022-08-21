package ch14.comparator;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member() {
    }

    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    /**
     * HashSet을 구현하기 위해 equals()와 hashCode()으 재정의 해야 한다.
     */
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Member) {

            Member member = (Member) obj;
            if (this.memberId == member.memberId) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){   //toString 메서드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    /**
     * Comparable의 경우 this와 기존 것을 비교했다면,
     * Comparator는 매개 변수 2개를 받는데 앞의 것이 this이고 뒤의 것이 기존 것이다.
     * @param member1: this
     * @param member2: 기존
     */
    @Override
    public int compare(Member member1, Member member2) {
//        return (member1.memberId - member2.memberId); // 오름차순
        return (member2.memberId - member1.memberId); // 내림차순
    }
}
