import java.util.Scanner;
public class Menu{
	public void menu(User user){
		System.out.println("请选择业务:");
		System.out.println("1.查询");
		System.out.println("2.转账");
		System.out.println("3.取款");
		System.out.println("4.存款");
		System.out.println("5.交易流水");
		System.out.println("6.退出");
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