import java.util.Scanner;
public class TransferAccounts1{
	public void transferAccounts(User user){
		System.out.println("��ӭʹ��ת��ҵ��:");
		Scanner sr=new Scanner(System.in);
		System.out.println("�������˺�:");
		int param1=sr.nextInt();
		user.setNumber(param1);
		System.out.println("��������:");
		int param2=sr.nextInt();
		user.setSum(param2);
			if(param2>1000){
				System.out.println("���㣬�����ԣ�");
				TransferAccounts0 again=new TransferAccounts0();
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
						TransferAccounts0 again=new TransferAccounts0();
						again.transferAccounts(user);
					}
					else if(param3==3){
					Menu menu=new Menu();
					menu.carte(user);
					}
			}
	}
}
