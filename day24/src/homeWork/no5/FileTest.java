package homeWork.no5;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("src");//创建对象，参数目录
		findFile(file);//调用方法，打印文件
	}


	public  static void findFile(File file){
		if(file.isDirectory()){//判断是否是文件夹
			File[] files = file.listFiles();//把文件夹转换为文件列表
			for(File f:files){
				if(f.isFile()){
					System.out.println(f.getName());//打印文件名
				}else{
					findFile(f);
				}
			}
		}
	}
}
