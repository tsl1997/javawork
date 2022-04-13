package homeWork.no8;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Tester {
	/*IO流自命题：将一个文件夹的内容复制到另外一个文件夹里面
	* 方法：遍历文件夹（递归）File
	* 方法：移动文件 FileOutputStream*/
	@Test //复制文件夹成功
	public void test() throws Exception {
		//先去复习一下file类的基本操作
		//1：首先给定一个文件夹的目录、遍历文件目录
		File file = new File("src\\homeWork\\no8\\test");//复制前的文件路径
		File cvFile = new File("src\\homeWork\\no8\\cv");//复制后的文件路径
		findFile(file,cvFile);//我增加了文件的层级和类别
	}

	private void findFile(File file,File cvFile) throws Exception{
		String name = file.getName();//获取当前文件的名称
		if(file.isDirectory()){
			File[] files = file.listFiles();//将目录转化为文件数组
			File file1 = new File(cvFile.getPath() +"\\"+ name);//重新定义参数
			file1.mkdir();//创建写后的路径文件夹
			for(File f : files){
				//这里的问题是要将写入的路径当成参数传入进去，且参数为目录的File文件
				findFile(f,file1);//递归遍历，先注释掉内容
			}
		}else{//当一个文件不是文件夹时，他一定文件
			String aPath = file.getAbsolutePath();
			String path = cvFile.getPath()+"\\"+name;//要复制到的位置
			//先读取文件
			FileInputStream fi = new FileInputStream(aPath);//基础字节流输入
			FileOutputStream fo = new FileOutputStream(path);//基础字节流输出
			byte[] bs = new byte[1024];
			int len;
			while((len = fi.read(bs))!=-1){
				fo.write(bs,0,len);//将读取的内容写入的文件中去
			}
			fo.close();
			fi.close();//关闭资源
			System.out.println(aPath+"文件复制成功");//打印文件地址输出
		}
	}
}
