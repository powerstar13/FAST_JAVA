package ch14.comparable;

public class Member implements Comparable<Member> {

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

    /**
     * 콜백 함수이다.
     * @param member: 기존 Member를 순차적으로 가져온다.
     * @return int: this가 더 크면 양수, this가 더 작으면 음수, 같은 값이면 0을 반환한다.
     *              오름차순이 아니라 내림차순으로 하고 싶을 경우 음수와 양수를 바꿔주면 된다.
     */
    @Override
    public int compareTo(Member member) {

        // 풀어쓰면...
//        if (this.memberId > member.memberId) {
//            return 1; // 오름차순
//        }
//        else if (this.memberId < member.memberId) {
//            return -1; // 오름차순
//        }
//        else return 0;

        return (this.memberId - member.memberId); // 오름차순
//        return (member.memberId - this.memberId); // 내림차순
    }
}
