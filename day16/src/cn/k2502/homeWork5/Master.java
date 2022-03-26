package cn.k2502.homeWork5;

public class Master {
		/**看病技能*/
		public String treat(Pet pet){
			if (pet.getHP()<60){
				return "打针，吃药！";
			}else{
				return "我很健康！";
			}
		}
		/**喂食*/
		public String meal(Pet pet){
			if (pet.getHP()<98&&pet.getHP()>0){
				pet.setHP(pet.getHP()+3);
				return "喂食成功，健康值+3。当前健康值为："+pet.getHP();
			}
			return "吃饱了，不必喂食！当前健康值为："+pet.getHP();
		}
}
