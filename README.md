# 刘东赫 2022310906 大数据 221

## java 实验三  基于继承关系改进学生选课模拟系统

### 实验目的

1.掌握权限访问控制修饰符的使用

2.掌握继承的使用

### 业务要求

1.保持实验二的代码和readme版本不变；
2.新建代码仓库，在实验二代码的基础上完成本次实验；
3.业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义，探讨该系统中哪些类具有共性，作为父类，定义子类；
4.父类定义构造方法，子类定义构造方法，掌握super()用法；
5.基础对象类和测试类分别存放于不同的package中，验证权限访问控制、继承后属性及方法的可见性。


### 实验过程

1.教师和学生类中有相同属性，创造一个学校成员类作为父类，定义他们共同的属性，并利用super语句调用父类中的构造方法。
2.将测试类与属性类置于不同包中，并用import语句调用存放属性类的包中的java文件。
3.将程序入口处设置分割线以及界面的方法改为静态方法，便可直接通过类调用。
4.运行测试代码。


### 流程图

![image](https://github.com/77ldh/experiment3-CourseRegistrationSystemImprove/assets/145440886/cb1ff01b-2de9-42b1-89da-ec4c43cfb423)


### 核心代码

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
### 系统运行结果
![image](https://github.com/77ldh/experiment3-CourseRegistrationSystemImprove/assets/145440886/3db29fa5-1859-4a4e-b8cc-c63a034254f5)



### 编程感想

对上次代码不太满意，这次侧重继承重新编写。本次实验让我学会了父类以及子类的概念以及继承和调用，简化了代码，提高运行效率，让代码整体的逻辑性更加清楚。对往后代码的编写起到了积极作用。
