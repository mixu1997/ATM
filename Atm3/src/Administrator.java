import java.util.Scanner;

public class Administrator {
	public void  administrator() {
		while(true) {
			Scanner sr=new Scanner(System.in);
			System.out.println("请选择业务：");
			System.out.println("1.开户      2.销户     3.显示信息     4.修改    5.返回菜单");
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
	
