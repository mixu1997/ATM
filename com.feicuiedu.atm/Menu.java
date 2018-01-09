import java.util.Scanner;
public class Menu{
	public void carte(User user){
		System.out.println("qingxuanzebanliyewu:");
		System.out.println("1.chaxun");
		System.out.println("2.zhuanzhang");
		System.out.println("3.qukuan");
		System.out.println("4.cunkuan");
		System.out.println("5.tuichu");
		Scanner sr=new Scanner(System.in);
		int shuru=sr.nextInt();
		if(shuru==1){
			Query query=new Query();
			query.inquiry(user);
        }
        else if(shuru==2){
        	TransferAccounts1 again=new TransferAccounts1();
			again.transferAccounts(user);
        }
        else if(shuru==3){
        	Draw draw=new Draw();
        	draw.withdrawMoney(user);
        }
        else if(shuru==4){
        	Deposit deposit=new Deposit();
        	deposit.fund(user);
        }
        else if(shuru==5){
        	Entry entry=new Entry();
				entry.Login(user);
        }
		
	}
}