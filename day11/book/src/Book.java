/**这是一个图书类*/
public class Book {
	/**图书名称*/
	public String name;
	/**图书作者*/
	public String author;
	/**图书库存*/
	public int stock;
	/**图书编号*/
	public String number;
	/**输出图书信息*/
	public void showInfo(Book a){
		System.out.println(a.number+"\t《"+a.name+"》\t"+a.author+"\t"+a.stock);
	}

}
