package cn.homeWork.no5;

public class Tester {
	public static void main(String[] args) {
		Printer printer = new Printer();//创建打印机对象
		A4Paper a4Paper = new A4Paper();//创建纸张对象
		B5Paper b5Paper = new B5Paper();
		BlackInkBox blackInkBox = new BlackInkBox();//创建墨盒对象
		ColorInkBox colorInkBox = new ColorInkBox();

		printer.setInkBox(blackInkBox);//插入墨盒
		printer.setPaper(a4Paper);//插入纸张
		printer.print();//打印结果

		printer.setInkBox(colorInkBox);//插入墨盒
		printer.setPaper(b5Paper);//插入纸张
		printer.print();//打印结果

	}
}
