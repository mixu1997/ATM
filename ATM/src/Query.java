import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Query{
	public void inquiry(User1 user){
		System.out.println("��ѯҵ��:");
		System.out.println("�˻�����:�����");
		//User user=new User();
		int res=user.getMoney();
		System.out.println("���:"+res);
		System.out.println("1.������һ��");
		System.out.println("2.�˳�:");
		Scanner sr=new Scanner(System.in);
		int shuru=sr.nextInt();
		if(shuru==1){
			Menu menu=new Menu();
			menu.carte(user);
		}
		else if(shuru==2){
			Entry entry=new Entry();
			entry.Login(user);
		}
		
	}
}