import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Entry1{
		long zhanghao=370120180104L;
		long mima=123456;
		public void Login(User user){
			Scanner sr=new Scanner(System.in);
			System.out.println("�������˺�:");
			long zh=sr.nextLong();
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
				Entry entry=new Entry();
				entry.Login(user);

		}
		
}
}