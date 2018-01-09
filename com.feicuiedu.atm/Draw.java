import java.util.Scanner;
public class Draw{
	public void withdrawMoney(User user){
		System.out.println("huanyingshiyongqukuanyewu!");
		Scanner sr=new Scanner(System.in);
		System.out.println("qingshuruqukuanjine:");
		int param1=sr.nextInt();
		System.out.println("1.queren");
		System.out.println("2.chongxiushuru");
		System.out.println("3.fanhuicaidan");
		int param2=sr.nextInt();
		if(param2==1){
			System.out.println("caozuochenggong!");
			int money = user.getMoney();
			int res = money - param1;
			user.setMoney(res);
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