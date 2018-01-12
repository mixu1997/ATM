import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Draw{
	public void withdrawMoney(User user){
		System.out.println("欢迎使用取款业务!");
		Scanner sr=new Scanner(System.in);
		System.out.println("请输入金额::");
		int param1=sr.nextInt();
		System.out.println("1.确认");
		System.out.println("2.重新输入");
		System.out.println("3.返回菜单");
		int param2=sr.nextInt();
		if(param2==1){
			System.out.println("操作成功！");
			int money = user.getMoney();
			int res = money - param1;
			user.setMoney(res);
			Date date=new Date();
			SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
			String str=sp.format(date);
			user.setQtime(str);
			Menu menu=new Menu();
				menu.carte(user);
		}
		else if(param2==2){
			TransferAccounts0 again=new TransferAccounts0();
			again.transferAccounts(user);
		}
		else if(param2==3){
			Menu menu=new Menu();
				menu.carte(user);
		}
	}
}