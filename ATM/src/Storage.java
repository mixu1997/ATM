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
		map.put("账号",zhanghao);
		map.put("密码", mima);
		map.put("性别", xingbie);
		map.put("身份证号", shenfen);
		map.put("学历", xueli);
		map.put("地址", dizhi);
		map.put("姓名", xingming);
		

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
