import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

public class Amend {
	public void amend(User2 user) {
		try {
			while(true) {
				Scanner sr=new Scanner(System.in);
				File file=new File("work"+File.separator+"account.txt");
				ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
				Map<String,String> userMap=(Map<String,String>)ois.readObject();
				System.out.println("��ѡ��Ҫ�޸ĵ����ݣ�");
				System.out.println("1.����     2.����    3.ѧ��     4.��ϵ��ַ     5.���ز˵�");
				int param=sr.nextInt();
				if(param==1) {
					System.out.println("�������޸ĵ����룺");
					String param1=sr.next();
					userMap.replace("����",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==2) {
					System.out.println("�������޸ĵ�������");
					String param1=sr.next();
					userMap.replace("����",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==3) {
					System.out.println("�������޸ĵ�ѧ����");
					String param1=sr.next();
					userMap.replace("ѧ��",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==4) {
					System.out.println("�������޸ĵ���ϵ��ַ��");
					String param1=sr.next();
					userMap.replace("��ϵ��ַ",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==5) {
					Administrator ad=new Administrator();
					ad.administrator(user);
				}
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
