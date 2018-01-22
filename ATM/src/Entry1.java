import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Entry1{
		
		public void Login(User1 user){
			Scanner sr=new Scanner(System.in);
			System.out.println("请输入账号:");
			long zh=sr.nextLong();
			System.out.println("请输入密码:");
			long mm=sr.nextLong();
			long zh0=user.getZhanghao();
			long mm0=user.getMima();
			long zh1=user.getNumber1();
			int mm1=user.getMm1();
				if(zh==zh0&&mm==mm0||zh==zh1&&mm==mm1){
					Date date=new Date();
					SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
					String str=sp.format(date);
					System.out.println(str);
					Menu menu=new Menu();
					menu.carte(user);
				}
				else{
					System.out.println("输入错误，请重新输入:");
					Entry entry=new Entry();
					entry.Login(user);
				}
		}
}