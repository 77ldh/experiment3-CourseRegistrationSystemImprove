package Jicheng;

public class Students extends SchoolPersonnel {

    public Students(int number, String name, String sex, Curriculums[] curriculums) {
        super(number, name, sex, curriculums);
    }

    public void choiceCurriculums(Students student, int n, Curriculums curriculums1) {
        student.curriculums[n] = curriculums1;
        System.out.println(student.name + "选择" + student.curriculums[n].curriculumsname + "课程成功");
    }

    public void outCurriculums(Students student, int n) {
        System.out.println(student.name + "退选" + student.curriculums[n].curriculumsname + "课程成功");
        student.curriculums[n] = null;
    }
}
