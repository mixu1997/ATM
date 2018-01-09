import java.util.Scanner;
public class TransferAccounts1{
	public void transferAccounts(User user){
		System.out.println("huanyingshiyongzhuanzhang:");
		Scanner sr=new Scanner(System.in);
		System.out.println("qingshuruzhanghao:");
		int param1=sr.nextInt();
		user.setNumber(param1);
		System.out.println("qingshurujine:");
		int param2=sr.nextInt();
		user.setSum(param2);
		System.out.println("1.queren");
		System.out.println("2.chongxiushuru");
		System.out.println("3.fanhuicaidan");
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