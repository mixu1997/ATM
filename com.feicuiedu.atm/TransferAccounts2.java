import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class TransferAccounts2{
	public void display(User user){
		Scanner sr=new Scanner(System.in);
		System.out.println("显示信息:");
		int kh=user.getNumber();
		System.out.println("对方卡号:"+kh);
		System.out.println("对方姓名:翡翠侠");
		int je=user.getSum();
		System.out.println("转账金额:"+je);
		System.out.println("1.确认");
		System.out.println("2.返回上一级");
		int param=sr.nextInt();
		if(param==1){
			System.out.println("操作成功");
			int money = user.getMoney();
			int res1 = money - je;
			user.setMoney(res1);
			Date date=new Date();
			SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
			String str=sp.format(date);
			user.setZtime(str);
			Menu menu=new Menu();
				menu.carte(user);
		}
		else if(param==2){
			TransferAccounts1 again=new TransferAccounts1();
			again.transferAccounts(user);
		}
	}
} 