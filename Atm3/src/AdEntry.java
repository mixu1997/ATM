import java.util.Scanner;


public class AdEntry {
	public void admin() {
		String zh="370120180104";
		String mm="123456";
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("�������˺�");
			String str = sc.next();
			if (str.equals(zh)) {
				while (true) {
					System.out.println("����������");
					String str1 = sc.next();
					if (str1.equals(mm)) {
						System.out.println("��¼�ɹ�!");
						Administrator ad=new Administrator();
						ad.administrator();
					} 
					else {
						System.out.println("�������,����������");
					}
				}
			} 
			else {
				System.out.println("�˺Ŵ���,����������");
			}
		}
	}
}