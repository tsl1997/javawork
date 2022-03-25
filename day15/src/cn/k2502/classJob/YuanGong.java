package cn.k2502.classJob;
/**z这是一个抽象类*/
public abstract class YuanGong {
	private String name;
	private String post;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public YuanGong(String name, String post) {
		this.name = name;
		this.post = post;
	}

	public abstract String work();
}
