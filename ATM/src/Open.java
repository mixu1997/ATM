import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Open {
	public void open(User2 user) {
		while(true) {
			Scanner sr=new Scanner(System.in);
			System.out.println("���������룺");
			String param1=sr.next();//����
			String regex1="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
			boolean bl=param1.matches(regex1);
			if(bl==true) {
				System.out.println("������ɣ�");
				user.setPassword(param1);
				System.out.println("������������");
				String name=sr.next();
				String regex2="^.{1,10}$";
				if(name.matches(regex2)==true) {
					System.out.println("������ȷ��");
					user.setName(name);
					System.out.println("��ѡ���Ա�1.��       2.Ů");
					String sex=sr.next();
					user.setSex(sex);
					int i = Integer.valueOf(sex).intValue();//��String sexת��int����
					System.out.println("���������֤�ţ�");
					String id=sr.next();
					String regex3="^.{18}$";
					if(id.matches(regex3)==false) {
						System.out.println("������ȷ��");
						user.setId(id);
						System.out.println("��ѡ��ѧ����1.Сѧ   2.��ѧ   3.��ѧ   4.����");
						String xl=sr.next();
						user.setXl(xl);
						System.out.println("��������ϵ��ַ��");
						String site=sr.next();
						user.setSite(site);
						String regex4="^.{50}$";
						if(site.matches(regex4)==false) {
							System.out.println("������ɣ�");
						}
						else {
							System.out.println("���ó���50���֣����������룡");
						}
					}
					else {
						System.out.println("��ʽ�������������룡");
					}
					if(i==1) {
						String param="3701";
						Date date=new Date();
						SimpleDateFormat sd=new SimpleDateFormat("yyyyMMddHHmmssSSS");
						String str1 = sd.format(date);
						String zh=param+str1;
						user.setAccount(zh);
						System.out.println("�����˺��ǣ�"+zh);
						System.out.println("ע��ɹ����Զ����ز˵���");
						Storage so=new Storage();
						so.storage(user);//����ȫ����ɺ����ݴ����ı�
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
						System.out.println("�����˺��ǣ�"+zh);
						System.out.println("ע��ɹ����Զ����ز˵���");
						Storage so=new Storage();
						so.storage(user);
						Administrator ad=new Administrator();
						ad.administrator(user);
						break;
					}
				}
				else {
					System.out.println("���ó���10���֣����������룡");
				}
				
			}
			else {
				System.out.println("��ʽ�������������ã�");
			}
			
		}
		
	}
}
