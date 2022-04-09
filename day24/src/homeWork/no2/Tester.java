package homeWork.no2;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		//1:初始化数据
		HashMap<String, ArrayList<Student>> map = startDate();//详情查看下面的方法
		//2：打印学生信息--具体方法请看下面
		//toShow(map);
		//3:打印学生成绩
		//toScore(map);
		//4:打印学生成绩最值
		toScoreMAX(map);
		//5:学生成绩降序
		//toScoreNo(map);
	}

	/**程序初始化数据*/
	public static HashMap<String, ArrayList<Student>>  startDate(){
		ArrayList<Student> s1 = new ArrayList<>();//第一个班级
		s1.add(new Student("安其拉",99));
		s1.add(new Student("王昭君",89));
		s1.add(new Student("杨玉环",98));
		s1.add(new Student("貂蝉",88));
		s1.add(new Student("西施",79));
		ArrayList<Student> s2 = new ArrayList<>();//第二个班级
		s2.add(new Student("李白",66));
		s2.add(new Student("韩信",46));
		s2.add(new Student("赵云",67));
		s2.add(new Student("阿珂",96));
		s2.add(new Student("电耗子",56));
		ArrayList<Student> s3 = new ArrayList<>();//第3个班级
		s3.add(new Student("孙尚香",87));
		s3.add(new Student("刘备",67));
		s3.add(new Student("大乔",96));
		s3.add(new Student("小乔",57));
		s3.add(new Student("诸葛亮",99));
		HashMap<String, ArrayList<Student>> map = new HashMap<>();//创建学校
		map.put("法师",s1);//添加班级
		map.put("刺客",s2);
		map.put("三国",s3);
		return map;
	}

	/**打印所有的学生信息*/
	public static void toShow(HashMap<String, ArrayList<Student>> map){
		Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();//获取键值对
		for(Map.Entry<String, ArrayList<Student>> e:entries){
			System.out.println(e.getKey()+"班级：");//获取班级信息
			ArrayList<Student> value = e.getValue();//获取学生列表
			for(Student s:value){
				System.out.println(s);//打印学生信息
			}
		}
	}

	/**打印所有的学生成绩*/
	public static void toScore(HashMap<String, ArrayList<Student>> map){
		Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();//获取键值对
		for(Map.Entry<String, ArrayList<Student>> e:entries){
			System.out.println(e.getKey()+"班级：");//获取班级信息
			ArrayList<Student> value = e.getValue();//获取学生列表
			double sum=0;
			for(Student s:value){
				sum+=s.getScore();
			}
			System.out.println("总分为："+sum);
			System.out.println("平均分为："+sum/value.size());
		}
	}

	/**打印所有的学生成绩的最大值和最小值*/
	public static void toScoreMAX(HashMap<String, ArrayList<Student>> map){
		Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();//获取键值对
		for(Map.Entry<String, ArrayList<Student>> e:entries){
			System.out.println(e.getKey()+"班级：");//获取班级信息
			ArrayList<Student> value = e.getValue();//获取学生列表
			int size = value.size();
			for(int i=0;i<size;i++){
				for(int j=i;j<size;j++){
					double score1 = value.get(i).getScore();
					double score2 = value.get(j).getScore();
					if(score1<score2){
						Student temp=value.get(j);//临时对象
						value.set(j,value.get(i));//将前面的对象存到后面去
						value.set(i,temp);//将后面的对象存到前面去
					}
				}
			}
			System.out.println("最高分为："+value.get(0).getScore()+" 最高分的学生姓名是："+value.get(0).getName());
			System.out.println("最低分为："+value.get(size-1).getScore()+" 最低分的学生姓名是："+value.get(size-1).getName());
		}
	}

	/**打印所有的学生成绩的最大值和最小值*/
	public static void toScoreNo(HashMap<String, ArrayList<Student>> map){
		Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();//获取键值对
		for(Map.Entry<String, ArrayList<Student>> e:entries){
			System.out.println(e.getKey()+"班级：");//获取班级信息
			ArrayList<Student> value = e.getValue();//获取学生列表
			int size = value.size();
			for(int i=0;i<size;i++){
				for(int j=i;j<size;j++){
					double score1 = value.get(i).getScore();
					double score2 = value.get(j).getScore();
					if(score1<score2){
						Student temp=value.get(j);//临时对象
						value.set(j,value.get(i));//将前面的对象存到后面去
						value.set(i,temp);//将后面的对象存到前面去
					}
				}
			}
			for(Student s:value){
				System.out.println(s);//打印学生成绩
			}
		}
	}


}
