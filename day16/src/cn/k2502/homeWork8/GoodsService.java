package cn.k2502.homeWork8;

public class GoodsService {
	/**返回对象的方法*/
	/*public Foods findFoods(){
		return new Foods();
	}*/
	/*public TVs findTvs(){
		return new TVs();
	}*/
	/**判断*/
	public Goods findGoods(int  typeId){
		if(typeId ==1){
			return new TVs();
		}
		if(typeId ==2){
			return new Foods();
		}
		return null;
	}

}
