import java.util.Scanner;
public class TransferAccounts0{
	public void transferAccounts(User user){
		System.out.println("欢迎使用转账业务:");
		Scanner sr=new Scanner(System.in);
		System.out.println("请输入账号:");
		int param1=sr.nextInt();
		System.out.println("请输入金额:");
		int param2=sr.nextInt();
		System.out.println("1.确认");
		System.out.println("2.重新输入");
		System.out.println("3.返回菜单");
		int param3=sr.nextInt();
		if(param3==1){

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