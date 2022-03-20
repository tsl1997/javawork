/**图书管理类*/
public class BookService {
	/**这是一个写入方法
	 * @param number 图书编号 string
	 * @param name 名称
	 * @param author 作者
	 * @param stock 库存 int
	 * @param books 对象数组参数，后面对在里面创新新对象*/
	public void save(String number,String name,String author,int stock,Book[] books){
		for (int i=0;i< books.length;i++){
			if (books[i]==null){//如果这个对象不存在
				books[i]=new Book();//那么就新建一个这样的对象
				books[i].number=number;
				books[i].name=name;
				books[i].author=author;
				books[i].stock=stock;
				return;
			}
		}
		System.out.println("该数组已经存满！");
	}
	/**这是打印所有的图书信息*/
	public void showBooks(Book[] books){
		for (Book a:books){
			if (a==null){
				return;//如果对象不存在就停止方法
			}
			a.showInfo(a);//循环打印
		}
	}
}
