package KaoShi.no5;

public class PersonService {
	/**根据不同类型，调用不同的方法
	 * @param p Person类型参数*/
	public void method(Person p){
		if (p instanceof Teacher){
			((Teacher)p).teach();//向下转型，调用老师授课方法
		}else if (p instanceof Student){
			((Student)p).learn();//向下转型，调用学生学习方法
		}else{
			System.out.println("出现了莫名其妙的异常");//当人类对象既不是老师，也不是学生时
		}
	}
}
