package Jicheng;

public class Teachers extends SchoolPersonnel {

    public Teachers(int number, String name, String sex, Curriculums[] curriculums) {
        super(number, name, sex, curriculums);
    }

    public void openCurriculums(Teachers teacher, int n, Curriculums curriculums1) {
        teacher.curriculums[n] = curriculums1;
        System.out.println(teacher.name + "" + teacher.curriculums[n].curriculumsname);
    }
}