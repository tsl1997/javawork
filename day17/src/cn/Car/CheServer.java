package cn.Car;

public class CheServer {
	public Che[] ches=new Che[10];
	/**数据初始化*/
	public void init() {
		ches[0] = new JiaoChe("宝马","京NY28588",800,"X6");
		ches[1] = new JiaoChe("宝马","京CNY3284",600,"550i");
		ches[2] = new JiaoChe("别克","京NT37465",300,"林荫大道");
		ches[3] = new JiaoChe("别克","京NT96968",600,"GL8");
		ches[4] = new KeChe("金杯","京6566754",800,16);
		ches[5] = new KeChe("金龙","京8696997",800,16);
		ches[6] = new KeChe("金杯","京9696996",1500,34);
		ches[6] = new KeChe("金龙","京8696998",1500,34);
	}
}
