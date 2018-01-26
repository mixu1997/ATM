import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Modify {
	public void modify(User user) {//放入集合
		File file = new File("work" + File.separator + "account.txt");

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			HashMap<String, Object> hp = (HashMap<String, Object>) ois.readObject();
			hp.put(user.getAccount() + user.getId(), user);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(hp);
			ois.close();
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
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void write(HashMap<String, Object> hp) {//传数据
		File file = new File("work" + File.separator + "account.txt");
		if (file == null || file.length() == 0) {
			try {
				HashMap<String, Object> map = new HashMap<>();
				ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));
				map.putAll(hp);
				oos.writeObject(map);
				oos.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		else {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				HashMap<String, Object> hashmap = (HashMap<String, Object>) ois.readObject();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				hashmap.putAll(hp);
				oos.writeObject(hashmap);
				ois.close();
				oos.close();
			} 
			catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
