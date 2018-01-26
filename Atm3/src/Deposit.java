import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Deposit {
	public void deposit(User user) {
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("请输入存款金额");
			double balance = sc.nextDouble();
			if (balance > 0 & balance % 100 == 0) {
				double initialbalance = user.getBalance();
				user.setBalance(initialbalance + balance);
				System.out.println("存款完成,当前余额为:" + user.getBalance());
				String flow = "您存了" + balance + "元";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
				ArrayList<String> reco = user.getRecode();
				String str = sdf.format(new Date());
				reco.add(flow + str);
				user.setRecode(reco);
				Menu mu=new Menu();
				mu.menu(user);
			} 
			else {
				System.out.println("存入的金额必须是100的整数倍");
			}
		}
	}
}
