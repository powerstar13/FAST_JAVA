package ch15;

public class Member {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

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
}
