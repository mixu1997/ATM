import java.util.Scanner;
public class TransferAccounts0{
	public void transferAccounts(User1 user){
		System.out.println("��ӭʹ��ת��ҵ��:");
		Scanner sr=new Scanner(System.in);
		System.out.println("�������˺�:");
		long param1=sr.nextLong();
		long zh1=user.getNumber1();
		if(param1==zh1){
		System.out.println("��������:");
		int param2=sr.nextInt();
			if(param2>1000){
				System.out.println("���㣬�����ԣ�");
				TransferAccounts1 again=new TransferAccounts1();
				again.transferAccounts(user);
			}
			else{
				System.out.println("1.ȷ��");
				System.out.println("2.��������");
				System.out.println("3.���ز˵�");
				int param3=sr.nextInt();
					if(param3==1){
						TransferAccounts2 again=new TransferAccounts2();
						again.display(user);
					}
					else if(param3==2){
						TransferAccounts1 again=new TransferAccounts1();
						again.transferAccounts(user);
					}
					else if(param3==3){
						Menu menu=new Menu();
						menu.carte(user);
					}
			}
		}
		else {
			System.out.println("�û������ڣ����������룡");
			TransferAccounts1 again=new TransferAccounts1();
						again.transferAccounts(user);
		}
	}
}