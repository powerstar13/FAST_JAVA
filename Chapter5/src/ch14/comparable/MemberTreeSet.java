package ch14.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> memberTreeSet;

    public MemberTreeSet() {
        this.memberTreeSet = new TreeSet<>();
    }

    public void addMember(Member member) {
        memberTreeSet.add(member);
    }

    /**
     * Iterator를 사용하는 방법
     */
    public boolean removeMember(int memberId) {

        Iterator<Member> ir = memberTreeSet.iterator();

        while (ir.hasNext()) {

            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                memberTreeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for (Member member : memberTreeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
