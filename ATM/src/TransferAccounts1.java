import java.util.Scanner;
public class TransferAccounts1{
	public void transferAccounts(User1 user){
		System.out.println("欢迎使用转账业务:");
		Scanner sr=new Scanner(System.in);
		System.out.println("请输入账号:");
		long param1=sr.nextLong();
		long zh1=user.getNumber1();
		if(param1==zh1){
		/* user.setNumber(param1); */
		System.out.println("请输入金额:");
		int param2=sr.nextInt();
		user.setSum(param2);
			if(param2>1000){
				System.out.println("余额不足，请重试！");
				TransferAccounts0 again=new TransferAccounts0();
				again.transferAccounts(user);
			}
			else{
				System.out.println("1.确认");
				System.out.println("2.重新输入");
				System.out.println("3.返回菜单");
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
		else {
			System.out.println("用户不存在，请重新输入！");
			TransferAccounts0 again=new TransferAccounts0();
				again.transferAccounts(user);
		}
	}
}
