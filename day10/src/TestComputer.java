/**
 * 调用计算机类*/
public class TestComputer {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.cpu="4CPU";
		computer.zhuBan="不知道主板是啥玩意";
		computer.xianShiQi="1024*788";
		computer.yingPan="16.0 GB";
		computer.neiCun="2 TB";

		//调用方法
		computer.showInfo();
	}
}
