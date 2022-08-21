package ch15;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> memberHashMap;

    public MemberHashMap() {
        this.memberHashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        memberHashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {

        if (memberHashMap.containsKey(memberId)) {
            memberHashMap.remove(memberId);
            return true;
        }

        System.out.println("no element");
        return false;
    }

    public void showAllMember() {

        // HashMap을 그대로 출력해도 key-value로 나오지만 Iterator를 사용하는 방법으로 구현해보자면 아래와 같다.
        Iterator<Integer> ir = memberHashMap.keySet().iterator();

        while (ir.hasNext()) {

            int key = ir.next();
            Member member = memberHashMap.get(key);
            System.out.println(member);
        }
    }
}
