import java.util.Scanner;
public class Query{
	public void inquiry(User user){
		System.out.println("��ѯҵ��:");
		System.out.println("�˻�����:�����");
		//User user=new User();
		int res=user.getMoney();
		System.out.println("���:"+res);
		System.out.println("1.������һ��");
		System.out.println("2.�˳�:");
		Scanner sr=new Scanner(System.in);
		int shuru=sr.nextInt();
			if(shuru==1){
				Menu menu=new Menu();
				menu.carte(user);
			}
			else if(shuru==2){
				Entry entry=new Entry();
				entry.Login(user);
			}
	}
}