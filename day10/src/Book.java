/**
 * 创建图书类*/
public class Book {
	/**
	 * 名称 string*/
	public String name;
	/**
	 * 编号 string*/
	public String number;
	/**
	 * 作者 string*/
	public String author;
	/**
	 * 库存 int*/
	public int stock;

	public void showInfo(){
		System.out.println(number+"\t《"+name+"》\t"+author+"\t"+stock);
	}

}
