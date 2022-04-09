package classJob;

import org.junit.Test;

import java.io.File;
import java.util.Date;

public class FileTest {

	@Test
	public void text() throws Exception {
		File txtFile = new File("src\\classJob","1.jpg");
		boolean newFile = txtFile.createNewFile();
		System.out.println("文件创建成功了吗？"+newFile);
		//2:获取文件数据
		System.out.println("文件名称："+txtFile.getName());
		System.out.println("文件相对地址："+txtFile.getPath());
		System.out.println("相对路径："+txtFile.getAbsolutePath());
		System.out.println("文件字节："+txtFile.length());
		System.out.println("最后修改时间："+new Date(txtFile.lastModified()));
		//3:删除文件
		boolean delete = txtFile.delete();
		System.out.println("文件删除成功了吗？"+delete);
		boolean e = txtFile.exists();
		System.out.println("文件现在还存在吗？"+e);
	}

	@Test
	public void text1(){
		System.out.println(add(15));
	}

	public static long add(int nums){
		if(nums==1){
			return 1;
		}
		return add(nums-1)*nums;
	}
}
