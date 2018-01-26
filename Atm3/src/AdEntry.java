import java.util.Scanner;


public class AdEntry {
	public void admin() {
		String zh="370120180104";
		String mm="123456";
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("ÇëÊäÈëÕËºÅ");
			String str = sc.next();
			if (str.equals(zh)) {
				while (true) {
					System.out.println("ÇëÊäÈëÃÜÂë");
					String str1 = sc.next();
					if (str1.equals(mm)) {
						System.out.println("µÇÂ¼³É¹¦!");
						Administrator ad=new Administrator();
						ad.administrator();
					} 
					else {
						System.out.println("ÃÜÂë´íÎó,ÇëÖØĞÂÊäÈë");
					}
				}
			} 
			else {
				System.out.println("ÕËºÅ´íÎó,ÇëÖØĞÂÊäÈë");
			}
		}
	}
}