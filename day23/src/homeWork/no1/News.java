package homeWork.no1;

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

	public News(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public News() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof News)) return false;

		News news = (News) o;

		return name != null ? name.equals(news.name) : news.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(ID);
		sb.append("\t").append(name);
		return sb.toString();
	}
}
