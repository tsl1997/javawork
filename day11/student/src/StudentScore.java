/**这是学生成绩类*/
public class StudentScore {
	/**修改学生成绩，低于60分的加2分
	 * @param args 传入对象数组作为参数*/
	public void revise(Student[] args){
		for (int i=0;i< args.length;i++){//遍历数组
			if (args[i].score<60){//如果成绩小于60
				args[i].score+=2;//那么就加2分
			}
		}
	}
	/**打印学生信息
	 *@param args 传入对象数组作为参数*/
	public void print(Student[] args){
		for (Student a:args){
			a.showInfo();//循环打印输出语句
		}
	}

}
