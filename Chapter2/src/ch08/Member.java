package ch08;

public class Member {

    private String memberName; // 이름
    private int memberAge; // 나이
    private Gender memberGender; // 성별
    private int height; // 키
    private int weight; // 몸무게

    public enum Gender {

        M("남성"),
        W("여성");

        Gender(String description) {
            this.description = description;
        }

        private final String description;

        public String getDescription() {
            return description;
        }
    }

    public Member(String memberName, int memberAge, Gender memberGender, int height, int weight) {
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.height = height;
        this.weight = weight;
    }

    public String getMemberInfo() {
        return String.format("키가 %d이고 몸무게가 %d킬로인 %s이 있습니다. 이름은 %s이고 나이는 %d세입니다.", height, weight, memberGender.getDescription(), memberName, memberAge);
    }
}
