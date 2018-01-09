import java.util.Scanner;
public class Query{
	public void inquiry(User user){
		System.out.println("chaxunyewu:");
		System.out.println("zhanghuxinming:xxx");
		//User user=new User();
		int res=user.getMoney();
		System.out.println("yu e:"+res);
		System.out.println("1.fanhuishangyiji");
		System.out.println("2.tuichu:");
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