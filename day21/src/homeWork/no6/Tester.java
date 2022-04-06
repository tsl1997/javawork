package homeWork.no6;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		String str="sauisdusahdgusaduisahgduh";//定义随机字符
		String sd="";//对比目标
		int[] num=new int[str.length()];//保存出现次数
		String[] sp = str.split("");//分割成为字符串列表
		//2:逻辑
		for(int i=0;i<sp.length;i++) {
			if(sd.contains(sp[i])){
				int temp=sd.indexOf(sp[i]);//获取第一次出现的位置
				num[temp]++;//统计次数增加一次
			}else{
				sd+=sp[i];//没有就添加记录
				num[i]=1;//次数初始化
			}
		}
		int maxNum=0;//假设出现最多的次数
		for(int i=0;i<num.length;i++){
			if(num[i]==0){
				break;//当没有数据是退出循环
			}
			if(maxNum<num[i]){
				maxNum=num[i];//最大值赋值
			}
		}
		//3：打印结果
		System.out.println("出现次数最多的是："+sp[maxNum]);
		System.out.println("总出现了："+maxNum+"次");
	}
}
