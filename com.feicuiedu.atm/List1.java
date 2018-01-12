public class List1{
	public void depositlist(User user){
		String sr=user.getQtime();
		System.out.println("取款时间："+sr);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
	public void fundlist(User user){
		String sr=user.getCtime();
		System.out.println("存款时间："+sr);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
	public void displaylist(User user){
		String sr=user.getZtime();
		System.out.println("转账时间："+sr);
		long par1=user.getNumber1();
		System.out.println("转账卡号："+par1);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
}