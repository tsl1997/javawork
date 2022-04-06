package demo;

public class TestFangFa {
	public <T> void method(T t) {// T将来接收引用类型 t变量名
		System.out.println(t);
	}

	public <T> T toMethod(T t) {// T将来接收引用类型 t变量名
		return t;
	}
}
