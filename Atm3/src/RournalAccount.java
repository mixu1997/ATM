import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RournalAccount {
	public void journal(User user) {
		ArrayList<String> str=user.getRecode();
		 System.out.println(str);
		 System.out.println("查询成功！");
			System.out.println("请选择业务：1.返回菜单      2.退出");
			Scanner sc=new Scanner(System.in);
			int param=sc.nextInt();
			if(param==1) {
				Menu mu=new Menu();
				mu.menu(user);;
			}
			else {
				Pattern pa=new Pattern();
				pa.pattern();
			}
	}
}
