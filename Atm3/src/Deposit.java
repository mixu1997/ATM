import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Deposit {
	public void deposit(User user) {
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("����������");
			double balance = sc.nextDouble();
			if (balance > 0 & balance % 100 == 0) {
				double initialbalance = user.getBalance();
				user.setBalance(initialbalance + balance);
				System.out.println("������,��ǰ���Ϊ:" + user.getBalance());
				String flow = "������" + balance + "Ԫ";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
				ArrayList<String> reco = user.getRecode();
				String str = sdf.format(new Date());
				reco.add(flow + str);
				user.setRecode(reco);
				Menu mu=new Menu();
				mu.menu(user);
			} 
			else {
				System.out.println("����Ľ�������100��������");
			}
		}
	}
}
