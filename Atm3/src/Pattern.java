import java.util.Scanner;

public class Pattern {
	public void pattern() {
		Scanner sr=new Scanner(System.in);
		System.out.println("请选择模式登录！");
		System.out.println("1.管理员登录                 2.普通账号登录");
		int param=sr.nextInt();
		if(param==1) {
			AdEntry ae=new AdEntry();
			ae.admin();
		}
		else if(param==2) {
			Ordinary or=new Ordinary();
			or.ordinary();
		}
	}
}
