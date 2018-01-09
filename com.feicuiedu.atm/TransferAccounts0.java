import java.util.Scanner;
public class TransferAccounts0{
	public void transferAccounts(User user){
		System.out.println("huanyingshiyongzhuanzhang:");
		Scanner sr=new Scanner(System.in);
		System.out.println("qingshuruzhanghao:");
		int param1=sr.nextInt();
		System.out.println("qingshurujine:");
		int param2=sr.nextInt();
		System.out.println("1.queren");
		System.out.println("2.chongxiushuru");
		System.out.println("3.fanhuicaidan");
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