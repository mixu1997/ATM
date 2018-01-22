import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

public class Cancel {
	public void  cancel() {
		try {
			while(true) {
				Scanner sr=new Scanner(System.in);
				ObjectInputStream ois= new ObjectInputStream(new FileInputStream("work"+File.separator+"account.txt"));
				Map<String,String> userMap=(Map<String,String>)ois.readObject();
				System.out.println("请输入账号：");
				String account=sr.next();
				System.out.println("请输入身份证号：");
				String id=sr.next();
				if(account.equals(userMap.get("账号"))&&id.equals(userMap.get("身份证号"))) {
					userMap.remove("账号");
					userMap.remove("性别");
					userMap.remove("学历");
					userMap.remove("姓名");
					userMap.remove("密码");
					userMap.remove("身份证号");
					userMap.remove("地址");
					File file=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
					break;
				}
				else {
					System.out.println("输入错误，请重新输入！");
				}
				ois.close();
			}
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
