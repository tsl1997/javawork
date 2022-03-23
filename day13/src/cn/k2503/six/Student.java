package cn.k2503.six;

public class Student extends Human{
	/**语文成绩*/
	private int chinese;
	/**数学成绩*/
	private int math;
	/**英语成绩*/
	private int english;

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		if (chinese <= 0){
			chinese = 1;
			return;//成绩不能为负数
		}
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math <= 0){
			math = 1;
			return;//成绩不能为负数
		}
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		if (english <= 0){
			english = 1;
			return;//成绩不能为负数
		}
		this.english = english;
	}

	public String  getSum(){
		int sum=chinese+math+english;//计算总分
		return getName()+"语文："+getChinese()+"\t数学："+getMath()+"\t英语："
				+getEnglish()+"\t总分:"+sum;
	}

	public Student(String name,int chinese, int math, int english) {
		super(name);
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
}
