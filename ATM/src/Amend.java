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
				System.out.println("请选择要修改的内容！");
				System.out.println("1.密码     2.姓名    3.学历     4.联系地址     5.返回菜单");
				int param=sr.nextInt();
				if(param==1) {
					System.out.println("请输入修改的密码：");
					String param1=sr.next();
					userMap.replace("密码",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==2) {
					System.out.println("请输入修改的姓名：");
					String param1=sr.next();
					userMap.replace("姓名",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==3) {
					System.out.println("请输入修改的学历：");
					String param1=sr.next();
					userMap.replace("学历",param1);
					File file1=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file1);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
				}
				if(param==4) {
					System.out.println("请输入修改的联系地址：");
					String param1=sr.next();
					userMap.replace("联系地址",param1);
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
