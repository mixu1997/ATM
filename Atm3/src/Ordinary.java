import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//普通用户登录

public class Ordinary {
	public void ordinary() {
		Scanner sc=new Scanner(System.in);
		while (true) {
			try {
				System.out.println("请输入账号或身份证号:");
				File file = new File("work" + File.separator + "account.txt");
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				HashMap<String, Object> hashmap = (HashMap<String, Object>) ois.readObject();
				Set<String> keyset = hashmap.keySet();// 定义set集合,获取HashMap集合的键
				String str = sc.next();

				for (String key : keyset) {
					if (key.startsWith(str) || key.endsWith(str)) {// 判断HashMap中的键是否有以输入的账号开头,或以输入的身份证号结尾的
						Object ob = hashmap.get(key);
						User user = (User) ob;
						String userpassword = user.getPassword();
						while (true) {
							System.out.println("请输入密码");
							String password = sc.next();
							if ((userpassword.equals(password))) {
								System.out.println("登录成功");
								Menu mu=new Menu();
								mu.menu(user);
							} 
							else {
								System.out.println("密码输入错误,请重新输入:");
							}
						}
					} 
					else {
						System.out.println("用户不存在");
					}
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
