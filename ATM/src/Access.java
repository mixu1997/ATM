import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Access {
	public void storage(User1 user) {
		try {
			File file=new File("work"+File.separator+"money.txt");
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
			int res=user.getMoney();
			Map<String,Object>userMap=new HashMap<>();
			userMap.put("balance",res);
			oos.writeObject(userMap);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void read (User1 user) {
		try {
			File file=new File("work"+File.separator+"money.txt");
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			Map<String,Object> userMap=(Map<String,Object>)ois.readObject();
			System.out.println("”‡∂Ó£∫"+userMap.get("balance"));
			ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
