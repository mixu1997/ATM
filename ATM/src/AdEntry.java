import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AdEntry {
	Long zhanghao=370120180104L;
	long mima=123456;
	public void adEntry(User2 user){
		while(true) {
		Scanner sr=new Scanner(System.in);
		System.out.println("请输入账号:");
		long zh=sr.nextLong();
		System.out.println("请输入密码:");
		long mm=sr.nextLong();
			if(zh==zhanghao&&mm==mima){
				Date date=new Date();
				SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
				String str=sp.format(date);
				System.out.println(str);
				Administrator ad=new Administrator();
				ad.administrator(user);
			}
			else{
				System.out.println("输入错误，请重新输入:");

			}
		}
	}
}