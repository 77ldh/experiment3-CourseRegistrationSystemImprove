# 刘东赫 2022310906 大数据 221

## java 实验二 学生选课模拟系统

### 实验目的

1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法

2.掌握面向对象的类设计方法（属性、方法）

3.掌握类的继承用法，通过构造方法实例化对象

### 业务要求

学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。初期为了设计简单，每名教师讲 1 门课程，每名学生选 1 门课程。对象示例：教师（编号、姓名、性别、所授课程、......）学生（编号、姓名、性别、所选课程、......）课程（编号、课程名称、上课地点、时间、......）以上属性仅为示例，同学们可以自行扩展

1.编写上述实体类以及测试主类

2.在测试主类中，实例化多个类实体，模拟 1）教师开设某课；2）学生选课、退课 3）打印学生课表信息（包括：编号、课程名称、上课地点、时间、授课教师等）

3.编写实验报告。


### 实验过程

1.自己先是大约画了一下流程图，明确大致怎么写这个程序以及需要实现哪些功能&#x20;

2.根据不同的功能确定需要有的基本类和方法&#x20;

3.重写 toString（）方法，来实现对学生信息的简单调用

### 流程图
![161a6e4cf5cae44a0c8f216fc83efbb](https://github.com/77ldh/experiment2-CourseRegistrationSystem/assets/145440886/8f7a32d7-08ad-4306-92a6-2fc4c8493f20)


### 核心代码

    while (flag1) {                     //while循环使选课系统持续在线

    	System.out.println(toString(stu));
    	System.out.println("选课请输入1,退出选课系统输入0:");        // next方式接收字符串,并判断是否还有输入
    	Scanner choose1 = new Scanner(System.in);      // 从键盘接收数据choose
        if (choose1.hasNext()) {                       //choose1为第一次接受的键盘输入
        	String str1 = choose1.next();              //把第一次键盘输入传递给str1
        	 switch(str1) {
        	 case "0" :
        	 {
        		 System.out.println("已退出选课系统.");
        		 flag1 = false;                       //flag1为false后直接结束最外层while循环
        	 }
        	 break;
        	 case "1" :
        	 {
        		 System.out.println("请输入想要选择的课程的序号:");
        		 Scanner scan = new Scanner(System.in);  //第二次键盘输入为scan
        		 if (scan.hasNext())
        		 {
        			 String cbs = scan.next();               //第二次键盘输入传递给cbs
        			 switch(cbs)                             //cbs为第二次输入的选课序号
        			 {
        			 	case "0" :
        			 		{if(course1.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("线性代数");
        			 		loopMethod(stu);flag1=false;
        			 		}
        			 		else
        			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
        			 	break;
        			 	case "1" :
        			 	{
        			 		if(course2.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("大学英语");
        			 		loopMethod(stu);flag1 = false;
        			 	}
        			 		else
        			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
        			 	break;
        			 	case "2" :
        			 	{
        			 		if(course3.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("中国哲学史");
        			 		loopMethod(stu);flag1 = false;
        			 	}
        			 		else
        			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
        			 	break;
        			 	case "3" :
        			 	{
        			 		if(course4.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("实习课程");
        			 		loopMethod(stu);flag1 = false;
        			 	}
        			 		else
        			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
        			 	break;
        			 	default :
        			 	{System.out.println("你输入了一个不正确的选课序号!");flag1 = false;}
        			 	break;
        			 }
        		 }
        		 scan.close();}
        	break;
        	default :
        	{System.out.println("你输入了一个不正确的选择序号!");flag1 = false;}   //输入错误的编号则退出选课系统
        	break;
        }}
        choose1.close();

    	 }
### 系统运行结果
![1963fbb7781298921db91e467396df0](https://github.com/77ldh/experiment2-CourseRegistrationSystem/assets/145440886/9dd1b2f0-e1f8-4a41-a633-18f82e475e55)


### 编程感想

这次的编程要自己从头到尾有始有终各方面都要考虑到。在脑子里边过一遍“如果我要用这个系统，这个系统该有什么功能”，在想明白有什么功能之后，下一步想的是“我应该如何实现这些功能呢？”。提升了我头脑里对于程序开发的完整思路。 在选课之前，有负责的老师把课程排好，把课程和授课老师的信息提前录入进入系统了，然后再允许学生登入来退课选课。 这就是最基本的思路了。在动手写的时候，就会再遇到新的问题了。 在 Course 里边用了一个产生随机数的属性，Math.random()来模拟以及选了这门课的人数，100 减去这个人数就是剩下的课容量，从而判断能否继续选课。 最后在 Test 类中，重写了 toString()方法，将他作为能够反复调用显示打印学生信息的方法。 在程序接口里边， 最原来想的是在登入选课系统后来一个 while(true)的循环，只有选择退出系统时才会退出系统。可以通过 scanner*反复*接收新的键盘输入，同时希望有能类似于 c 语言中的 goto 语句来便利的实现代码运行时的跳转，或者是多层循环实现代码跳转运行，这样就能达到了登入系统持续在线的一个实现。 想的很好但是实际上，实现起来相当费劲。 首先卡死在了 scanner 的接受键盘输入上：在刚写出选课系统的时候尝试了一下能不能正常运行，选课部分的功能没问题，但是出现了第一个死循环-scanner 在接收键盘信息后，不会清空缓存区内已经接收的数据，也就是说，在新一遍的循环中，压根还没输入新的选项，就按照着原来保存在缓存区的数据直接运行，让程序进入了死循环。（这就离谱，因为没找到那种像 python 或者 c 语言里边那种写一行代码直接清空缓冲区的） 为了跳过这个不能接收新字符，特地写了多层循环，就是在每一个的选课成功的后面带上一个 loopMethod 方法，进入退课循环。然后可以在退课循环里边选择退课后选课或者退课后直接退出程序。果然我发现，我想多了。 不管这个循环怎么样，最后都要经过一次 scanner 重新接受键盘输入，关键做不到怎么清空缓冲区。最后把 loopMethod（）里边的变成了退课后直接退出选课系统，直接避免所有的死循环。
