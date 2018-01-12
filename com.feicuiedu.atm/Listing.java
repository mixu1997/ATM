import java.util.Scanner;
public class Listing{
	public void listing(User user){
		Scanner str=new Scanner(System.in);
		System.out.println("1.取款记录");
		System.out.println("2.存款记录");
		System.out.println("3.转账记录");
		System.out.println("4.返回菜单");
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