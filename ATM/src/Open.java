import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Open {
	public void open(User2 user) {
		while(true) {
			Scanner sr=new Scanner(System.in);
			System.out.println("请设置密码：");
			String param1=sr.next();//密码
			String regex1="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
			boolean bl=param1.matches(regex1);
			if(bl==true) {
				System.out.println("设置完成！");
				user.setPassword(param1);
				System.out.println("请输入姓名：");
				String name=sr.next();
				String regex2="^.{1,10}$";
				if(name.matches(regex2)==true) {
					System.out.println("输入正确！");
					user.setName(name);
					System.out.println("请选择性别：1.男       2.女");
					String sex=sr.next();
					user.setSex(sex);
					int i = Integer.valueOf(sex).intValue();//把String sex转成int类型
					System.out.println("请输入身份证号：");
					String id=sr.next();
					String regex3="^.{18}$";
					if(id.matches(regex3)==false) {
						System.out.println("输入正确！");
						user.setId(id);
						System.out.println("请选择学历：1.小学   2.中学   3.大学   4.其他");
						String xl=sr.next();
						user.setXl(xl);
						System.out.println("请输入联系地址：");
						String site=sr.next();
						user.setSite(site);
						String regex4="^.{50}$";
						if(site.matches(regex4)==false) {
							System.out.println("输入完成！");
						}
						else {
							System.out.println("不得超过50个字，请重新输入！");
						}
					}
					else {
						System.out.println("格式错误请重新输入！");
					}
					if(i==1) {
						String param="3701";
						Date date=new Date();
						SimpleDateFormat sd=new SimpleDateFormat("yyyyMMddHHmmssSSS");
						String str1 = sd.format(date);
						String zh=param+str1;
						user.setAccount(zh);
						System.out.println("您的账号是："+zh);
						System.out.println("注册成功，自动返回菜单！");
						Storage so=new Storage();
						so.storage(user);//输入全部完成后将数据传到文本
						Administrator ad=new Administrator();
						ad.administrator(user);
						break;
					}
					else if(i==2) {
						String param="3702";
						Date date=new Date();
						SimpleDateFormat sd=new SimpleDateFormat("yyyyMMddHHmmssSSS");
						String str1 = sd.format(date);
						String zh=param+str1;
						user.setAccount(zh);
						System.out.println("您的账号是："+zh);
						System.out.println("注册成功，自动返回菜单！");
						Storage so=new Storage();
						so.storage(user);
						Administrator ad=new Administrator();
						ad.administrator(user);
						break;
					}
				}
				else {
					System.out.println("不得超过10个字，请重新输入！");
				}
				
			}
			else {
				System.out.println("格式错误请重新设置！");
			}
			
		}
		
	}
}
