package cn.k2502.homeWork2;

public class Master {
		/**看病技能*/
		public String treat(Pet pet){
			if (pet.getHP()<60){
				return "打针，吃药！";
			}else{
				return "我很健康！";
			}
		}
}
