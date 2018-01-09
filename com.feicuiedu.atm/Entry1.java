import java.util.Scanner;
public class Entry1{
		long zhanghao=370120180104L;
		long mima=123456;
		public void Login(User user){
			Scanner sr=new Scanner(System.in);
			System.out.println("qingshuruzhanghao:");
			long zh=sr.nextLong();
			System.out.println("qingshurumima:");
			long mm=sr.nextLong();
			if(zh==zhanghao&&mm==mima){
				Menu menu=new Menu();
				menu.carte(user);
			}
				else{
				System.out.println("shuruyouwu,qingchongxiuchuru:");
				Entry entry=new Entry();
				entry.Login(user);

		}
		
}
}