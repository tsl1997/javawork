import sun.security.util.AuthResources_it;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pet[] baby = new Pet[4];
		Scanner input = new Scanner(System.in);
		for (int i=0;i< baby.length;i++){
			baby[i]=new Pet();
			System.out.println("请输入第"+(i+1)+"个宠物的名称：");
			baby[i].nikeName = input.next();
			System.out.println("请输入第"+(i+1)+"个宠物的颜色：");
			baby[i].color = input.next();
			System.out.println("请输入第"+(i+1)+"个宠物的性别：");
			baby[i].sex = input.next();
			System.out.println("请输入第"+(i+1)+"个宠物的品种：");
			baby[i].brand = input.next();
			System.out.println("请输入第"+(i+1)+"个宠物的价格：");
			baby[i].price = input.nextInt();
		}

		for (Pet a:baby){
			a.showInfo();
		}
		
	/*	Pet baby=new Pet();//new一个对象
		baby.nikeName="派蒙";
		baby.color="白色";
		baby.sex='食';//应急食物嘛
		baby.brand="提瓦特";
		baby.price=888;

		*//*Pet pet1=new Pet("安珀","红色",'女',"提瓦特",999);
		Pet pet2=new Pet("可莉","红色",'女',"提瓦特",233);
		Pet pet3=new Pet("鹤","无色",'女',"提瓦特",666);*//*

		baby.showInfo();//调用方法*/

	}
}
