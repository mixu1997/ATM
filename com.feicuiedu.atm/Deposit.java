import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Deposit{
	public void fund(User user){
		System.out.println("��ӭʹ�ô��ҵ��");
		Scanner sr=new Scanner(System.in);
		System.out.println("����������:");
		int param1=sr.nextInt();
		System.out.println("1.ȷ��");
		System.out.println("2.��������");
		System.out.println("3.���ز˵�");
		int param2=sr.nextInt();
			if(param2==1){
				int money=user.getMoney();
				int res1=money+param1;
				user.setMoney(res1);
				Date date=new Date();
				SimpleDateFormat sp=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
				String str=sp.format(date);
				user.setCtime(str);
				System.out.println("�����ɹ���");
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