package homeWork.no1;

import java.io.File;

public class FileTest {
	public static void main(String[] args)throws Exception{
		//测试目录
		File myFile = new File("src\\homeWork");//创建一个文件夹对象
		boolean directory = myFile.isDirectory();
		System.out.println("文件是目录吗？"+directory);
		boolean exists = myFile.exists();
		System.out.println("文件目录存在吗？"+exists);
		//测试文件
		File txtFile = new File("src\\homeWork\\no1","test.txt");//创建一个txt文件对象
		boolean newFile = txtFile.createNewFile();
		System.out.println("文件创建成功了吗？"+newFile);
		String path = txtFile.getPath();
		System.out.println("文件的相对路径是："+path);
		String absolutePath = txtFile.getAbsolutePath();
		System.out.println("文件的绝对路径是："+absolutePath);
		String name = txtFile.getName();
		System.out.println("文件的名称是："+name);
		long length = txtFile.length();
		System.out.println("文件的字节大小是："+length);
		boolean delete = txtFile.delete();
		System.out.println("文件删除了吗？"+delete);

	}
}
