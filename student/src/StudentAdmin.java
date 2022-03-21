import java.util.Scanner;

/**
 * 这是一个学生管理类*/
public class StudentAdmin {
	public Student[] students =new Student[10];//默认创建10个对象数组保存数据
	public Scanner input=new Scanner(System.in);//设置scanner类

	/**
	 * 添加学生*/
	public void create(){
		for (int i=0;i<students.length;i++){
			if (students[i]==null){
				students[i]=new Student();//设置一个对象，避免null异常
				out2(i);
				//输出添加的结果
				System.out.println("添加成功！");
				out1();
				out(i);
				break;
			}
		}
	}

	//减少重复代码，构造方法，打印标头
	public void out1(){
		System.out.println("编号\t姓名\t年龄\tpython\tjava\tlinux\tsql\t总分\t平均分");
	}

	//减少重复代码，构造方法,输出所有[i]信息
	public void out(int i) {
		System.out.println(i+"\t"+students[i].name+"\t"+students[i].age+"\t"+students[i].python
				+"\t"+students[i].java+"\t"+students[i].linux+"\t"+students[i].sql
				+"\t"+students[i].sum+"\t"+students[i].avg);//输出所有的信息
	}

	/**
	 * 查找学生编号*/
	public void select(){
		System.out.println("请输入你要查找的学生编号：");
		int num = input.nextInt();//获取输入的编号
		if (num <0 || num >=students.length){//编号超出范围时，提示非法数据
			System.out.println("输入的编号不合法，请重新输入！");
			return;
		}
		for (int i=0;i<students.length;i++){
			if (students[i]==null){
				System.out.println("系统找不到你需要的编号！");
				break;
			}
			if (i==num){
				out1();
				out(i);
				break;
			}
		}
	}


	/**
	 * 根据编号更新学生*/
	public void update(){
		System.out.println("请输入你要更新的学生编号：");
		int num = input.nextInt();//获取输入的编号
		if (num <0 || num >=students.length){//编号超出范围时，提示非法数据
			System.out.println("输入的编号不合法，请重新输入！");
			return;
		}
		for (int i=0;i<students.length;i++){
			if (students[i]==null){
				System.out.println("系统找不到你需要的编号！");
				break;
			}
			if (i==num){
				out2(i);
				//输出添加的结果
				System.out.println("更新学生信息！");
				out1();
				out(i);
				break;
			}
		}

	}
	/**
	 * 输入学生的姓名和年龄*/
	private void out2(int i) {
		System.out.println("请输入学生的姓名：");
		students[i].name = input.next();//获取用户输入的姓名数据
		System.out.println("请输入学生的年龄：");
		students[i].age = input.nextInt();//获取用户输入的年龄数据
	}


}
