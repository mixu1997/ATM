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

public class Cancel {
	public void  cancel() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ�����˻�:");
		String account = sc.next();
		System.out.println("���������֤��:");
		String cardid = sc.next();
		String str = account + cardid;
		try {
			File file = new File("work" + File.separator + "account.txt");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			HashMap<String, Object> hm = (HashMap<String, Object>) ois.readObject();

			if (hm.containsKey(str)) {
				hm.remove(str);
				System.out.println("ɾ���ɹ�!");
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(hm);
				ois.close();
			} 
			else {
				System.out.println("�˺Ų�����,����������");
			}
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
	}
}
