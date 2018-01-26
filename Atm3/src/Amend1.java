import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 * 修改业务
 * @author mx
 *
 */
public class Amend1 {
	public void amend() {
		Scanner sc=new Scanner(System.in);
		File file = new File("work" + File.separator + "account.txt");// 创建File对象,获取文本
		if (file == null || file.length() == 0) {
			System.out.println("没有用户，请注册！");

		} else {
			while (true) {
				System.out.println("请输入修改账户:");
				String account = sc.next();
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
					HashMap<String, Object> hashmap = (HashMap<String, Object>) ois.readObject();
				    System.out.println(hashmap);
					Set<String> keyset = hashmap.keySet();//遍历出来获取键，根据键更改数据
					boolean bn = false;
					for (String key : keyset) {
						if (key.startsWith(account)) {
							Object ob = hashmap.get(key);
							User temp = (User) ob;
							Amend2 am=new Amend2();
							am.amend(temp, file, hashmap);
							bn = true;
							break;
						}
					}
					if (!bn) {
						System.out.println("账户不存在");
					}
					break;
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
}
