/**
 * 游戏怪兽类*/
public class GameMonster {
	/**
	 * 名称 string*/
	public String name;
	/**
	 * 生命值 int*/
	public int hp;
	/**
	 * 类型 string*/
	public String type;

	public void showInfo(){
		System.out.println("怪兽名称："+name+"\n怪兽生命值："+hp+"\n怪兽类型："+type);
	}

}
