import java.util.Scanner;
public class Listing{
	public void listing(User user){
		Scanner str=new Scanner(System.in);
		System.out.println("1.ȡ���¼");
		System.out.println("2.����¼");
		System.out.println("3.ת�˼�¼");
		System.out.println("4.���ز˵�");
		int param=str.nextInt();
		if(param==1){
			List1 list1=new List1();
			list1.depositlist(user);
		}
		 else if(param==2){
			List1 list1=new List1();
			list1.fundlist(user);
		}
		else if(param==3){
			List1 list1=new List1();
			list1.displaylist(user);
		}
		else if(param==4){
			Menu menu=new Menu();
			menu.carte(user);
		}
	}
}