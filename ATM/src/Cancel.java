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
				System.out.println("�������˺ţ�");
				String account=sr.next();
				System.out.println("���������֤�ţ�");
				String id=sr.next();
				if(account.equals(userMap.get("�˺�"))&&id.equals(userMap.get("���֤��"))) {
					((File) userMap).delete();
				}
				else {
					System.out.println("����������������룡");
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
