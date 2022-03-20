/**这是一个测试图书的类*/
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();//创建一个对象
		book.number="B001";
		book.name="西游记";
		book.author="吴承恩";
		book.stock=24;
		book.showInfo(book);//尝试打印

		Book[] books = new Book[5];//创建对象数组
		BookService service = new BookService();//创建一个BookService类的对象
		service.save("B001","西游记","吴承恩",24,books);//传递数据
		service.save("B002","红楼梦","曹雪芹",14,books);
		service.save("B003","三国演义","罗贯中",94,books);
		service.save("B004","水浒传","施耐庵",90,books);
		System.out.println("图书编号     书名      作者    库存");
		service.showBooks(books);//打印结果

	}
}
