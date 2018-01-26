import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Query {
	public void query(User user) {
		try {
			File file = new File("work" + File.separator + "account.txt");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));// 直接读取
			HashMap<String, Object> hashmap = (HashMap<String, Object>) ois.readObject();
			System.out.println(user);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
