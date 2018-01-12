import java.util.Scanner;
public class Query{
	public void inquiry(User user){
		System.out.println("查询业务:");
		System.out.println("账户姓名:翡翠侠");
		//User user=new User();
		int res=user.getMoney();
		System.out.println("余额:"+res);
		System.out.println("1.返回上一级");
		System.out.println("2.退出:");
		Scanner sr=new Scanner(System.in);
		int shuru=sr.nextInt();
		if(shuru==1){
			Menu menu=new Menu();
				menu.carte(user);
		}
		else if(shuru==2){
			Entry entry=new Entry();
			entry.Login(user);
		}

	}
}