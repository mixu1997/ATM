import java.util.Scanner;
public class Menu{
	public void carte(User1 user){
		System.out.println("��ѡ��ҵ��:");
		System.out.println("1.��ѯ");
		System.out.println("2.ת��");
		System.out.println("3.ȡ��");
		System.out.println("4.���");
		System.out.println("5.�˳�");
		System.out.println("6.������ˮ");
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
        	Entry1 entry=new Entry1();
			entry.Login(user);
        }
		 else if(shuru==6){
        	Listing ls=new Listing();
				ls.listing(user);
        }
		
	}
}