import java.util.Scanner;

public class Administrator {
	public void  administrator(User2 user) {
		while(true) {
			Scanner sr=new Scanner(System.in);
			System.out.println("��ѡ��ҵ��");
			System.out.println("1.����      2.����     3.��ʾ��Ϣ     4.�޸�");
			int param1=sr.nextInt();
			if(param1==1) {
				Open op=new Open();
				op.open(user);
			}
			else if(param1==2) {
				Cancel cal=new Cancel();
				cal.cancel();
			}
			else if(param1==3) {
				Read rd=new Read();
				rd.read();
				boolean bl=false;
			}
		}
		
	}
}
	
