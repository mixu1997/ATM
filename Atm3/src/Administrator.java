import java.util.Scanner;

public class Administrator {
	public void  administrator() {
		while(true) {
			Scanner sr=new Scanner(System.in);
			System.out.println("��ѡ��ҵ��");
			System.out.println("1.����      2.����     3.��ʾ��Ϣ     4.�޸�    5.���ز˵�");
			int param1=sr.nextInt();
			if(param1==1) {
				Open op=new Open();
				op.open();
			}
			else if(param1==2) {
				Cancel cal=new Cancel();
				cal.cancel();
			}
			else if(param1==3) {
				Read rd=new Read();
				rd.information();
			}
			else if(param1==4) {
				Amend1 am=new Amend1();
				am.amend();
			}
			else if(param1==5) {
				Pattern pt=new Pattern();
				pt.pattern();
				boolean bl=false;
			}
		}
		
	}
}
	
