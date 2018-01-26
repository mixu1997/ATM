import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;


public class Open {
	
	private String pam;
	private String password;
	private String name;
	private String sex;
	private String id;
	private String xl;
	private String site;
	private String account;
	private double balance=0.0;
	HashMap<String, Object> hp = new HashMap<>();
	public void open() { 
		
		Scanner sca=new Scanner(System.in);
		//370120180104
		while (true) {
			System.out.println("请设置密码");
			this.password = sca.next();
			if (!password.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$")) {
				System.out.println("密码输入错误,请重新输入");
			} 
			else {
				break;
			}
		}
		
		while(true) {
			System.out.println("请输入姓名:");
			this.name = sca.next();
			if(!name.matches("^.{1,10}$")) {
				System.out.println("姓名格式输入错误,请重新输入");
			}
			else {
				break;
			}
		}
		
		while (true) {
			System.out.println("请选择性别：1.男      2.女");
			String param = sca.next();
			if (param.equals("1")) {
				this.pam = "01";
				this.sex="男";
				break;
			} 
			else if (param.equals("2")) {
				this.pam = "02";
				this.sex="女";
				break;
			} 
			else {
				System.out.println("输入有误请重新输入:");

			}
		}
		
		while (true) {	
			System.out.println("请输入身份证号：");
			this.id = sca.next();
			if (!id.matches("([0-9]{1,18})")) {
				System.out.println("身份证号格式错误,请重新输入:");
			} 
			else {
				break;
			}
		}
		
		while (true) {
			System.out.println("请选择学历：1.小学     2.中学     3.大学     4.其他");
																
			String param = sca.next();
			if (param.equals("1")) {
				this.xl = "小学";
				break;
			} 
			else if (param.equals("2")) {
				this.xl = "中学";
				break;
			} 
			else if (param.equals("3")) {
				this.xl = "大学";
				break;
			} 
			else if (param.equals("4")) {
				this.xl = "其他";
				break;
			} 
			else {
				System.out.println("输入错误,请重新输入");
			}
		}
		
		while (true) {
			System.out.println("请输入地址:");
			this.site = sca.next();
			if (site.length() > 150) {
				System.out.println("地址长度最大输入长度为150,请重新输入");
				this.site = sca.next();
			} 
			else {
				break;
			}
		}
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String time = sd.format(new Date());
		String account = "37" + pam + time;
		
		User user = new User(account, password, name, sex, id, xl, site, balance);
		//System.out.println(user);
		System.out.println("开户完成!");
		String key = account +id;
		//System.out.println(key);
		HashMap<String, Object> hp = new HashMap<>();
		hp.put(key, user);
		Modify mo=new Modify();
		mo.write(hp);
		System.out.println("存入成功");
		Administrator ad=new Administrator();
		ad.administrator();
	}
}