package ch13;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> memberHashSet;

    public MemberHashSet() {
        this.memberHashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        this.memberHashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        memberHashSet.add(member);
    }

    /**
     * Iterator르 사용하는 방법
     */
    public boolean removeMember(int memberId) {

        Iterator<Member> ir = memberHashSet.iterator();

        while (ir.hasNext()) {

            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                memberHashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for (Member member : memberHashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
