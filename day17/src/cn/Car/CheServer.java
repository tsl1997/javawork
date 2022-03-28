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
		ches[7] = new KeChe("金龙","京8696998",1500,34);
	}

	public Che findChe(String brand,String type,int seatNum){
		for (Che che:ches) {
			if (type != null) {
				if (!(che instanceof JiaoChe)){
					break;//找不到就停止
				}
				if (che instanceof JiaoChe){
					if (brand.equals(che.getBrand())&&type.equals(((JiaoChe) che).getType())){
						return che;
					}
				}
			}
			if (seatNum!=0){
				if (!(che instanceof KeChe)){
					break;
				}
				if (che instanceof KeChe){
					if (brand.equals(che.getBrand()) && seatNum==((KeChe) che).getSeatNum()){
						return che;
					}
				}
			}
		}
		return null;
	}
	/**增强版*/
	public Che findCheX(String brand,String type,int seatNum){
		for (Che che:ches){
			if (new JiaoChe(brand,type).equals(che)){
				return che;
			}
			if (new KeChe(brand,seatNum).equals(che)){
				return che;
			}
		}
		return null;
	}
}
