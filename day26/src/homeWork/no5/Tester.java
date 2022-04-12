package homeWork.no5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Tester {
	public static void main(String[] args) throws Exception{
		/*需求说明：使用BufferedInputStream和BufferedOutputStream实现图片复制。*/
		//首先我复制了一张加密朋克的图片，1240.png  首先甩锅异常
		FileInputStream fi = new FileInputStream("1240.png");
		BufferedInputStream bi = new BufferedInputStream(fi);//缓冲输入流
		FileOutputStream fo = new FileOutputStream("src\\homeWork\\no5\\5.png");
		BufferedOutputStream bo = new BufferedOutputStream(fo);//缓冲输出流
		byte[] bs = new byte[1024];//byte数组
		int len;
		while ((len = bi.read(bs))!=-1){
			bo.write(bs,0,len);//将读取的内容写入到新文件中
		}
		System.out.println("图片复制成功！");//输出信息，成功复制图片
		bo.close();
		bi.close();//关闭资源
	}
}
