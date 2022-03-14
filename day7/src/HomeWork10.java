import java.util.Scanner;

public class HomeWork10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] music={"Island","Ocean","Pretty","Sun"};//原数组
		String[] musics=new String[music.length+1];//新数组
		//打印原来的数组
		System.out.print("原数组为：");
		for (int i=0;i< music.length;i++){
			System.out.print(music[i]+"\t");
		}
		//输入数据
		System.out.print("\n请输入歌曲名称：");
		String music1 = input.next();//获取用户输入的数据
		musics[music.length]=music1;//将用户的值给最后一个数据
		//填充其他的数据
		for (int i=0;i< music.length;i++){
			musics[i]=music[i];//数据转移
		}
		//数据排序
		for (int i=0;i< musics.length-1;i++){
			for (int j=0;j< musics.length-1-i;j++){
				if (musics[i].charAt(0)>musics[i+1].charAt(0)){//比较首字母大小
					String temp=musics[i];
					musics[i]=musics[i+1];
					musics[i+1]=temp;
				}
			}
		}
		//输出结果
		System.out.println("插入后数组为：");
		for (int i=0;i< musics.length;i++){
			System.out.print(musics[i]+"\t");
		}
	}
}
