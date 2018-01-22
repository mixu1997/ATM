import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Read {
	public void read() {
		try {
			File file=new File("work"+File.separator+"account.txt");
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
			Map<String,String> userMap=(Map<String,String>)ois.readObject();
			System.out.println("账号是："+userMap.get("账号"));
			System.out.println("身份证号是"+userMap.get("身份证号"));
			System.out.println("姓名是："+userMap.get("姓名"));
			ois.close();
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
