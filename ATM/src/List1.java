public class List1{
	public void depositlist(User1 user){
		String sr=user.getQtime();
		System.out.println("ȡ��ʱ�䣺"+sr);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
	public void fundlist(User1 user){
		String sr=user.getCtime();
		System.out.println("���ʱ�䣺"+sr);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
	public void displaylist(User1 user){
		String sr=user.getZtime();
		System.out.println("ת��ʱ�䣺"+sr);
		long par1=user.getNumber1();
		System.out.println("ת�˿��ţ�"+par1);
		System.out.println("************************************************");
		Menu menu=new Menu();
		menu.carte(user);
	}
}