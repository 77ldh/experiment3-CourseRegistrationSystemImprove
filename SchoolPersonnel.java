package Jicheng;

public class SchoolPersonnel {
    public int number;
    public String name;
    public String sex;
    public Curriculums[] curriculums;

    public SchoolPersonnel() {

    }

    public SchoolPersonnel(int number, String name, String sex, Curriculums[] curriculums) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.curriculums = curriculums;
    }
}