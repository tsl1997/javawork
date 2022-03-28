package cn.k2503.car;
/**这是一个汽车管理类*/
public class CarAdmin {
	/**汽车管理数据*/
	public Car[] car(){
		Car[] cars = new Car[8];//目前自由8辆车
		cars[0]=new Coach("宝马","京NY28588",800,"X6");
		cars[1]=new Coach("宝马","京CNY3284",600,"550i");
		cars[2]=new Coach("别克","京NT37465",300,"林荫大道");
		cars[3]=new Coach("别克","京NT96968",600,"GL8");
		cars[4]=new Bus("金杯","京6566754",800,"16座");
		cars[5]=new Bus("金龙","京8696997",800,"16座");
		cars[6]=new Bus("金杯","京9696996",1500,"34座");
		cars[7]=new Bus("金龙","京8696998",1500,"34座");
		return cars;
	}
}
