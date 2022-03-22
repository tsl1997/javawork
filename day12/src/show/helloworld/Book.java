package show.helloworld;
/**这是一个图书类*/
public class Book {
	private String number;//编号
	private String name;
	private String author;
	private int stock;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0){
			System.out.println("库存不能为负数！");
			return;
		}
		this.stock = stock;
	}
	//全参构造
	public Book(String number, String name, String author, int stock) {
		setName(name);
		setAuthor(author);
		setStock(stock);
		setNumber(number);
	}
	//无参构造
	public Book() {
	}
	//	传递自我介绍内容string
	public String showInfo() {
		return getNumber()+"\t\t"+getName()+"\t\t"+getAuthor()+"\t\t"+getStock();
	}
}
