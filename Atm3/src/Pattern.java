import java.util.Scanner;

public class Pattern {
	public void pattern() {
		Scanner sr=new Scanner(System.in);
		System.out.println("��ѡ��ģʽ��¼��");
		System.out.println("1.����Ա��¼                 2.��ͨ�˺ŵ�¼");
		int param=sr.nextInt();
		if(param==1) {
			AdEntry ae=new AdEntry();
			ae.admin();
		}
		else if(param==2) {
			Ordinary or=new Ordinary();
			or.ordinary();
		}
	}
}
