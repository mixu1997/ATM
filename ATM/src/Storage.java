import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Storage {
	public void storage(User2 user) {
		String zhanghao=user.getAccount();
		String mima=user.getPassword();
		String xingbie=user.getSex();
		String shenfen=user.getId();
		String xueli=user.getXl();
		String dizhi=user.getSite();
		String xingming=user.getName();
		Map<String, String> map = new HashMap<>();
		map.put("�˺�",zhanghao);
		map.put("����", mima);
		map.put("�Ա�", xingbie);
		map.put("���֤��", shenfen);
		map.put("ѧ��", xueli);
		map.put("��ַ", dizhi);
		map.put("����", xingming);
		

		try {
			File file=new File("work"+File.separator+"account.txt");
			FileOutputStream fos= new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(map);
			oos.flush();
			oos.close();
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
