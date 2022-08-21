package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> memberList;

    public MemberArrayList() {
        this.memberList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        this.memberList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    /**
     * Iterator르 사용하는 방법
     */
    public boolean removeMember(int memberId) {

        Iterator<Member> ir = memberList.iterator();

        while (ir.hasNext()) {

            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                memberList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for (Member member : memberList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
