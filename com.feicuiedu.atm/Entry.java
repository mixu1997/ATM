import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Entry{
		String zhanghao="370120180104";
		long mima=123456;
		public void Login(User user){
			while(true){
				Scanner sr=new Scanner(System.in);
				System.out.println("请输入账号:");
				String zh=sr.next();
				if(zh.length()==12){
					System.out.println("请输入密码:");
					long mm=sr.nextLong();
					if(zh==zhanghao&&mm==mima){
						Date date=new Date();
						SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
						String str=sp.format(date);
						System.out.println(str);
						Menu menu=new Menu();
		                menu.carte(user);
					}
					else{
						System.out.println("输入错误，请重新输入:");
						Entry1 entry=new Entry1();
						entry.Login(user);
					}
				}
				else{
					System.out.println("长度错误，请重新输入");
				}
		}
	
		
}
}