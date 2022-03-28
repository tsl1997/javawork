package cn.homeWork.no2;

import org.junit.Test;

public class Tester {
	@Test//测试静态方法投票
	public void Test1(){
		for (int i = 0; i <101;i++){
			System.out.println(Ballot.giveBallot());//投票操作
		}
	}

	@Test//测试实例方法投票
	public void Test2() {
		Ballot[] ballots = new Ballot[101];
		for (int i=0;i<ballots.length;i++){
			ballots[i] = new Ballot();
			System.out.println(ballots[i].giveBallot());
		}
	}


}
