import java.util.Scanner;
public class TransferAccounts2{
	public void display(User user){
		Scanner sr=new Scanner(System.in);
		System.out.println("xianshixinxi:");
		int kh=user.getNumber();
		System.out.println("duifangkahao:"+kh);
		System.out.println("duifangxingming:haojian");
		int je=user.getSum();
		System.out.println("zhuanzhangjine:"+je);
		System.out.println("1.queren");
		System.out.println("2.fanhuishangyiji");
		int param=sr.nextInt();
		if(param==1){
			System.out.println("caozuochenggong!");
			int money = user.getMoney();
			int res1 = money - je;
			user.setMoney(res1);
			Menu menu=new Menu();
				menu.carte(user);
		}
		else if(param==2){
			TransferAccounts1 again=new TransferAccounts1();
			again.transferAccounts(user);
		}
	}
} 