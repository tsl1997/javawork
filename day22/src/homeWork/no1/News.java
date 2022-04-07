package homeWork.no1;
/**这是一个新闻类服务*/
public class News {
	private int ID;
	private String name;
	private String author;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
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

	public News(int ID, String name, String author) {
		this.ID = ID;
		this.name = name;
		this.author = author;
	}

	public News() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(ID);
		sb.append("：").append(name);
		return sb.toString();
	}
}
