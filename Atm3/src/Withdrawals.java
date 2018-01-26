import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Withdrawals {
	public void withdrawal(User user) {
		Scanner sc=new Scanner(System.in);
		boolean bln = false;
		while (true) {
			System.out.println("请输入取款金额:");
			double amount = sc.nextDouble();
			if (amount % 100 != 0) {
				System.out.println("金额必须是100的整数倍,请重新输入");
				bln = true;
			} else if (amount > user.getBalance()) {
				System.out.println("余额不足,请重新输入:");
				bln = true;
			} else {
				double balance = user.getBalance();
				user.setBalance(balance - amount);
				System.out.println("取款完成,当前余额为:" + user.getBalance());
				String flow = "您取了" + balance + "元";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
				ArrayList<String> reco = user.getRecode();
				String str = sdf.format(new Date());
				reco.add(str+flow);
				user.setRecode(reco);
				Menu mu=new Menu();
				mu.menu(user);
			}
		}

	}
}
