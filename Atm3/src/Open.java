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
			System.out.println("����������");
			this.password = sca.next();
			if (!password.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$")) {
				System.out.println("�����������,����������");
			} 
			else {
				break;
			}
		}
		
		while(true) {
			System.out.println("����������:");
			this.name = sca.next();
			if(!name.matches("^.{1,10}$")) {
				System.out.println("������ʽ�������,����������");
			}
			else {
				break;
			}
		}
		
		while (true) {
			System.out.println("��ѡ���Ա�1.��      2.Ů");
			String param = sca.next();
			if (param.equals("1")) {
				this.pam = "01";
				this.sex="��";
				break;
			} 
			else if (param.equals("2")) {
				this.pam = "02";
				this.sex="Ů";
				break;
			} 
			else {
				System.out.println("������������������:");

			}
		}
		
		while (true) {	
			System.out.println("���������֤�ţ�");
			this.id = sca.next();
			if (!id.matches("([0-9]{1,18})")) {
				System.out.println("���֤�Ÿ�ʽ����,����������:");
			} 
			else {
				break;
			}
		}
		
		while (true) {
			System.out.println("��ѡ��ѧ����1.Сѧ     2.��ѧ     3.��ѧ     4.����");
																
			String param = sca.next();
			if (param.equals("1")) {
				this.xl = "Сѧ";
				break;
			} 
			else if (param.equals("2")) {
				this.xl = "��ѧ";
				break;
			} 
			else if (param.equals("3")) {
				this.xl = "��ѧ";
				break;
			} 
			else if (param.equals("4")) {
				this.xl = "����";
				break;
			} 
			else {
				System.out.println("�������,����������");
			}
		}
		
		while (true) {
			System.out.println("�������ַ:");
			this.site = sca.next();
			if (site.length() > 150) {
				System.out.println("��ַ����������볤��Ϊ150,����������");
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
		System.out.println("�������!");
		String key = account +id;
		//System.out.println(key);
		HashMap<String, Object> hp = new HashMap<>();
		hp.put(key, user);
		Modify mo=new Modify();
		mo.write(hp);
		System.out.println("����ɹ�");
		Administrator ad=new Administrator();
		ad.administrator();
	}
}