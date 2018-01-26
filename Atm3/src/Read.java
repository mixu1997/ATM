import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Read {
	public void information() {
		Scanner sc=new Scanner(System.in);
		File file = new File("work" + File.separator + "account.txt");
		if (file.equals(null) || file.length() == 0) {
			HashMap<String, Object> hashmap = new HashMap<>();
			System.out.println("没有用户，请返回开户！");
			Administrator ad=new Administrator();
			ad.administrator();
		} 
		else {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				HashMap<String, Object> hm = (HashMap<String, Object>) ois.readObject();
				System.out.println(hm.values());
				ois.close();
				while (true) {
					System.out.println("1.返回菜单   2.退出");
					String str = sc.next();
					if (str.equals("1")) {
						Administrator ad=new Administrator();
						ad.administrator();
					} 
					else if (str.equals("2")) {
						Pattern pa=new Pattern();
						pa.pattern();
					} 
					else {
						System.out.println("输入错误,重新输入:");
					}
				}
			} 
			catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
	}

}
