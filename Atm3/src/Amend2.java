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
			System.out.println("请选择要修改的属性:(1.密码    2.姓名    3.学历    4.联系地址    5.退出)");
			String input = sc.next();
			if (input.equals("1")) {
				System.out.println("请输入新密码");
				String newpassword = sc.next();
				temp.setPassword(newpassword);
			} else if (input.equals("2")) {
				System.out.println("请输入修改后的姓名:");
				String newname = sc.next();
				temp.setName(newname);
			} else if (input.equals("3")) {
				while (true) {
					System.out.println("请输入修改后的学历(1.小学    2.中学    3.大学    4.其他):");
					String neweducation = sc.next();
					if (neweducation.equals("1")) {
						String xl = "小学";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("2")) {
						String xl = "中学";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("3")) {
						String xl = "大学";
						temp.setXl(xl);
						break;
					} else if (neweducation.equals("4")) {
						String xl = "其他";
						temp.setXl(xl);
						break;
					} else {
						System.out.println("输入错误,只能是1-4,重新输入");
					}
				}
			} else if (input.equals("4")) {
				System.out.println("请输入修改后的地址:");
				String site = sc.next();
				temp.setSite(site);
			}else if(input.equals("5")){
				Administrator ad=new Administrator();
				ad.administrator();
			}
			else {
				System.out.println("输入错误,重新输入");
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
