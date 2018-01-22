import java.util.Scanner;

public class Atm{
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("请选择模式登录！");
		System.out.println("1.管理员登录                 2.普通账号登录");
		int param=sr.nextInt();
		if(param==1) {
			User2 user=new User2();
			AdEntry ae=new AdEntry();
			ae.adEntry(user);
		}
		if(param==2) {
			Entry entry=new Entry();
			User1 user=new User1(1000);
			entry.Login(user);
		}
	}
}