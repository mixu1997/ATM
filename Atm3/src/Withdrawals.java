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
			System.out.println("������ȡ����:");
			double amount = sc.nextDouble();
			if (amount % 100 != 0) {
				System.out.println("��������100��������,����������");
				bln = true;
			} else if (amount > user.getBalance()) {
				System.out.println("����,����������:");
				bln = true;
			} else {
				double balance = user.getBalance();
				user.setBalance(balance - amount);
				System.out.println("ȡ�����,��ǰ���Ϊ:" + user.getBalance());
				String flow = "��ȡ��" + balance + "Ԫ";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
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
