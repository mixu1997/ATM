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
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));// ֱ�Ӷ�ȡ
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
		System.out.println("��ѯ�ɹ���");
		System.out.println("��ѡ��ҵ��1.���ز˵�      2.�˳�");
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
