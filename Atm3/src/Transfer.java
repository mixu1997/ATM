import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//转账业务
public class Transfer {
	public void transfer(User user) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("请输入对方账号:");
			String str1 = sc.next();
			File file = new File("work" + File.separator + "account.txt");
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				HashMap<String, Object> hm = (HashMap<String, Object>) ois.readObject();
				Set<String> keyset = hm.keySet();

				for (String key : keyset) {
					Object obj = hm.get(key);
					User tuser = (User) obj;
					String taccount = tuser.getAccount();
					if (taccount.equals(str1)) {
						while (true) {
							System.out.println("请输入转账金额:");
							double tamount = sc.nextDouble();
							if (tamount < 0 | tamount % 100 != 0) {
								System.out.println("金额必须是100的整数倍,请重新输入");
							} else if (tamount > user.getBalance()) {
								System.out.println("余额不足,请重新输入:");
							} else {
								System.out.println("转账成功!");
								user.setBalance(user.getBalance() - tamount);
								tuser.setBalance(tuser.getBalance() + tamount);
								String flow = "向" + str1 + "转了" + tamount + "元";
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");// 操作执行的时间
								ArrayList<String> reco = user.getRecode();
								String str = sdf.format(new Date());
								reco.add(str+flow);
								user.setRecode(reco);
								break;
							}
						}
						Menu mu=new Menu();
						mu.menu(user);
					} 

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
