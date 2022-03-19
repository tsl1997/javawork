import java.util.Scanner;

/**这是一个管理员类
 * */
public class Admin {
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的账号：");
		String username = scanner.next();//获取用户的账号
		System.out.println("请输入密码：");
		int password = scanner.nextInt();//获取用户密码
		if (username.equals("admin")&&password==123456){//如果账号和密码同时匹配成功
			System.out.println("请输入你的新密码：");
			password = scanner.nextInt();//覆盖旧密码
			System.out.println("修改密码成功,您的新密码为:"+password);
		}else {
			System.out.println("用户名和密码不匹配!您没有权限更新管理员信息.");//不成功提示
		}


	}
}
