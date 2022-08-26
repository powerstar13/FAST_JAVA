package grade;

public class PasFailEvaluation implements GradeEvaluation {

    @Override
    public String getGrade(int point) {

        if (point >= 70)
            return "P";
        else
            return "F";
    }
}
