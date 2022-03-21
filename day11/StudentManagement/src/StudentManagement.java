/**这是一个学生管理类*/
public class StudentManagement {
	String[] names=new String[5];
	/**新增学生*/
	public void add(String name){
		for (int i=0;i< names.length;i++){
			if (names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	/**打印所有学生信息*/
	public String showInfo(){
		String name="";
		for (String a:names){
			if (a==null){
				break;
			}
			name+=a+"\t";
		}
		return name;
	}
	/**查找学生姓名*/
	public boolean find(int start,int end,String name){
		boolean isoK=false;
		if (start<=0){
			System.out.println("请输入大于0的整数！");
			return isoK;
		}
		if (end> names.length){
			System.out.println("结束的长度大于数组长度，输入不合法！");
			return isoK;
		}
		if (start>end){
			System.out.println("开始位置大于结束位置，请重新输入！");
			return isoK;
		}
		for (int i=start;i<=end;i++){
			if (name.equals(names[i])){
				isoK=true;
				return isoK;
			}
		}
		return isoK;
	}
}
