import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
public class Entry{
		
		public void Login(User1 user){
			try {
			Scanner sr=new Scanner(System.in);
			System.out.println("�������˺�:");
			String zh=sr.next();
			System.out.println("����������:");
			String mm=sr.next();
			File file=new File("work"+File.separator+"account.txt");
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
			Map<String,String> userMap=(Map<String,String>)ois.readObject();
				if(zh.equals(userMap.get("�˺�"))&&mm.equals(userMap.get("����"))){
					Date date=new Date();
					SimpleDateFormat sp=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
					String str=sp.format(date);
					System.out.println(str);
					Menu menu=new Menu();
					menu.carte(user);
				}
				else{
					System.out.println("�����������������:");
					Entry entry=new Entry();
					entry.Login(user);
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}