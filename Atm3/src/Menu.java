import java.util.Scanner;
public class Menu{
	public void menu(User user){
		System.out.println("��ѡ��ҵ��:");
		System.out.println("1.��ѯ");
		System.out.println("2.ת��");
		System.out.println("3.ȡ��");
		System.out.println("4.���");
		System.out.println("5.������ˮ");
		System.out.println("6.�˳�");
		Scanner sr=new Scanner(System.in);
		int shuru=sr.nextInt();
		if(shuru==1){
			Query qu=new Query();
			qu.query(user);;
        }
        else if(shuru==2){
        	Transfer tr=new Transfer();
        	tr.transfer(user);;
        }
        else if(shuru==3){
        	Withdrawals wi=new Withdrawals();
        	wi.withdrawal(user);
        }
        else if(shuru==4){
        	Deposit de=new Deposit();
        	de.deposit(user);
        }
        else if(shuru==5){
        	RournalAccount ra=new RournalAccount();
        	ra.journal(user);
        }
		 else if(shuru==6){
			 Pattern pa=new Pattern();
			 pa.pattern();
        }
		
	}
}