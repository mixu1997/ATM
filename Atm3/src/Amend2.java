import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Amend2 {
	public void amend(User temp, File file, HashMap<String, Object> hashmap) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("��ѡ��Ҫ�޸ĵ�����:(1.����    2.����    3.ѧ��    4.��ϵ��ַ    5.�˳�)");
			String input = sc.next();
			if (input.equals("1")) {
				System.out.println("������������");
				String newpassword = sc.next();
				temp.setPassword(newpassword);
			} else if (input.equals("2")) {
				System.out.println("�������޸ĺ������:");
				String newname = sc.next();
				temp.setName(newname);
			} else if (input.equals("3")) {
				while (true) {
					System.out.println("�������޸ĺ��ѧ��(1.Сѧ    2.��ѧ    3.��ѧ    4.����):");
					String neweducation = sc.next();
					if (neweducation.equals("1")) {
						String xl = "Сѧ";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("2")) {
						String xl = "��ѧ";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("3")) {
						String xl = "��ѧ";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("4")) {
						String xl = "����";
						temp.setXl(xl);
						break;
					} else {
						System.out.println("�������,ֻ����1-4,��������");
					}
				}
			} else if (input.equals("4")) {
				System.out.println("�������޸ĺ�ĵ�ַ:");
				String site = sc.next();
				temp.setSite(site);
			}else if(input.equals("5")){
				Administrator ad=new Administrator();
				ad.administrator();
			}
			else {
				System.out.println("�������,��������");
			}
			
				String account = temp.getAccount();
				String userCard = temp.getId();
				String accountCard = account + userCard;
				hashmap.put(accountCard, temp);
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(hashmap);
				} 
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
