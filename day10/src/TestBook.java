import java.util.Scanner;

/**
 * 调用图书类*/
public class TestBook {
	public static void main(String[] args) {
		Book[] book = new Book[4];
		Scanner input = new Scanner(System.in);
		//	填入数据
		for (int i=0;i<book.length;i++){
			book[i]=new Book();
			System.out.println("请输入第"+(i+1)+"本图书的编号：");
			book[i].number = input.next();
			System.out.println("请输入第"+(i+1)+"本图书的名称：");
			book[i].name = input.next();
			System.out.println("请输入第"+(i+1)+"本图书的作者：");
			book[i].author = input.next();
			System.out.println("请输入第"+(i+1)+"本图书的库存：");
			book[i].stock = input.nextInt();
		}
		//调用方法
		System.out.println("图书编号\t\t书名\t\t作者\t\t库存");
		for (Book books:book){
			books.showInfo();
		}
	}
}
