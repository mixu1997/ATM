import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Scanner;

public class Cancel {
	public void  cancel() {
		try {
			while(true) {
				Scanner sr=new Scanner(System.in);
				File file=new File("work"+File.separator+"account.txt");
				ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
				Map<String,String> userMap=(Map<String,String>)ois.readObject();
				System.out.println("请输入账号：");
				String account=sr.next();
				System.out.println("请输入身份证号：");
				String id=sr.next();
				if(account.equals(userMap.get("账号"))&&id.equals(userMap.get("身份证号"))) {
					((File) userMap).delete();
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
