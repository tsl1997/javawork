/**
 * 测试游戏类*/
public class TestGame {
	public static void main(String[] args) {
		GameHero gameHero = new GameHero();
		GameMonster gameMonster = new GameMonster();
		GameArms gameArms = new GameArms();
		gameHero.name="亚瑟";
		gameHero.hp=4000;
		gameMonster.name="风暴龙王";
		gameMonster.hp=12000;
		gameMonster.type="大龙";
		gameArms.name="复活甲";
		gameArms.aggressivity=888;
		//调用方法
		gameHero.showInfo();
		gameMonster.showInfo();
		gameArms.showInfo();
	}
}
