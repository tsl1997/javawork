package cn.homeWork.no5;

public class Printer {
	private InkBox inkBox;
	private Paper paper;

	public InkBox getInkBox() {
		return inkBox;
	}

	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void print(){
		//inkBox.getInfo是为了调用方法。避免输出哈希地址，使用该方法一个返回String类型
		System.out.println("使用" +inkBox.getInfo()+"在"+paper.getPaper()+"上打印！");
	}
}
