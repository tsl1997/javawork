public class Main {
	public static void main(String[] args) {
		Pet baby=new Pet();//new一个对象
		baby.nikeName="派蒙";
		baby.color="白色";
		baby.sex='食';//应急食物嘛
		baby.brand="提瓦特";
		baby.price=888;

		Pet pet1=new Pet("安珀","红色",'女',"提瓦特",999);
		Pet pet2=new Pet("可莉","红色",'女',"提瓦特",233);
		Pet pet3=new Pet("鹤","无色",'女',"提瓦特",666);

		baby.showInfo();//调用方法
		pet1.showInfo();
		pet2.showInfo();
		pet3.showInfo();
	}
}
