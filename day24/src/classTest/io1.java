package classTest;

import java.io.FileOutputStream;

public class io1 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("3.txt");
		//2.向文件写入内容
		byte[] bArr="abc".getBytes();//{97,98,99}
		fos.write(bArr);

		//3.关流释放资源
		fos.close();

	}
}
