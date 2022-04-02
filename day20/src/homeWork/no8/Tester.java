package homeWork.no8;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		//数据
		Scanner sc = new Scanner(System.in);
		System.out.print("请保存一个图片文件名：");
		String photo = sc.nextLine();
		//逻辑
		System.out.println(photo.length());//获取去文件名长度
		photo = photo.trim();//去掉首尾空格
		System.out.println(photo.length());//获取去文件名长度
		if(photo.isEmpty()){
			System.out.println("文件名无实际意义，请重新输入！");
		}
		String p = photo.toLowerCase();//简化接下来的操作
		if(p.endsWith("jpg") || p.endsWith("jpeg") || p.endsWith("gif") || p.endsWith("png") || p.endsWith("bmp")  ){
			System.out.println("文件保存成功！");
		}else{
			System.out.println("该文件不是图片，保存失败！");
		}

	}
}
