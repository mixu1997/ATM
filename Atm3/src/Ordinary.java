import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//��ͨ�û���¼

public class Ordinary {
	public void ordinary() {
		Scanner sc=new Scanner(System.in);
		while (true) {
			try {
				System.out.println("�������˺Ż����֤��:");
				File file = new File("work" + File.separator + "account.txt");
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				HashMap<String, Object> hashmap = (HashMap<String, Object>) ois.readObject();
				Set<String> keyset = hashmap.keySet();// ����set����,��ȡHashMap���ϵļ�
				String str = sc.next();

				for (String key : keyset) {
					if (key.startsWith(str) || key.endsWith(str)) {// �ж�HashMap�еļ��Ƿ�����������˺ſ�ͷ,������������֤�Ž�β��
						Object ob = hashmap.get(key);
						User user = (User) ob;
						String userpassword = user.getPassword();
						while (true) {
							System.out.println("����������");
							String password = sc.next();
							if ((userpassword.equals(password))) {
								System.out.println("��¼�ɹ�");
								Menu mu=new Menu();
								mu.menu(user);
							} 
							else {
								System.out.println("�����������,����������:");
							}
						}
					} 
					else {
						System.out.println("�û�������");
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
