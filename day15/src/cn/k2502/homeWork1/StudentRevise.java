package cn.k2502.homeWork1;
/**这是一个学生修改类*/
public class StudentRevise {
	/**修改学生类的成绩数据*/
	public void revise(Student[] students){
		int temp=-1;//临时变量
		for (int i=0;i<students.length;i++){
			if (students[i]==null){
				break;//当对象为null时停止循环
			}
			if (students[i].getScore()<60){
				temp=i;//标记状态
				break;//当目标找到是停止循环
			}
		}
		if (temp>=0){
			for (int i=0;i<students.length;i++){
				if (students[i]==null){
					break;//当对象为null时停止循环
				}
				int a=students[i].getScore();//先获取原来的值
				students[i].setScore(a+2);//再操作赋值功能
			}
		}
	}
}
