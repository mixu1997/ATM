import java.util.Scanner;

public class Atm{
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("��ѡ��ģʽ��¼��");
		System.out.println("1.����Ա��¼                 2.��ͨ�˺ŵ�¼");
		int param=sr.nextInt();
		if(param==1) {
			User2 user=new User2();
			AdEntry ae=new AdEntry();
			ae.adEntry(user);
		}
		if(param==2) {
			Entry entry=new Entry();
			User1 user=new User1(1000);
			entry.Login(user);
		}
	}
}