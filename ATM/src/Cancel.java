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
				System.out.println("�������˺ţ�");
				String account=sr.next();
				System.out.println("���������֤�ţ�");
				String id=sr.next();
				if(account.equals(userMap.get("�˺�"))&&id.equals(userMap.get("���֤��"))) {
					userMap.remove("�˺�");
					userMap.remove("�Ա�");
					userMap.remove("ѧ��");
					userMap.remove("����");
					userMap.remove("����");
					userMap.remove("���֤��");
					userMap.remove("��ַ");
					File file=new File("work"+File.separator+"account.txt");
					FileOutputStream fos= new FileOutputStream(file);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(userMap);
					break;
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
