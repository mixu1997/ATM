import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Entry{
		String zhanghao="370120180104";
		long mima=123456;
		public void Login(User1 user){
			while(true){
				Scanner sr=new Scanner(System.in);
				System.out.println("�������˺�:");
				String zh=sr.next();
				if(zh.length()==12){
					System.out.println("����������:");
					long mm=sr.nextLong();
					if(zh==zhanghao&&mm==mima){
						Date date=new Date();
						SimpleDateFormat sp=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
						String str=sp.format(date);
						System.out.println(str);
						Menu menu=new Menu();
		                menu.carte(user);
					}
					else{
						System.out.println("�����������������:");
						Entry1 entry=new Entry1();
						entry.Login(user);
					}
				}
				else{
					System.out.println("���ȴ�������������");
				}
		}
	
		
}
}