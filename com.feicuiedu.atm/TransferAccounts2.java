import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class TransferAccounts2{
	public void display(User user){
		Scanner sr=new Scanner(System.in);
		System.out.println("��ʾ��Ϣ:");
		int kh=user.getNumber();
		System.out.println("�Է�����:"+kh);
		System.out.println("�Է�����:�����");
		int je=user.getSum();
		System.out.println("ת�˽��:"+je);
		System.out.println("1.ȷ��");
		System.out.println("2.������һ��");
		int param=sr.nextInt();
		if(param==1){
			System.out.println("�����ɹ�");
			int money = user.getMoney();
			int res1 = money - je;
			user.setMoney(res1);
			Date date=new Date();
			SimpleDateFormat sp=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
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