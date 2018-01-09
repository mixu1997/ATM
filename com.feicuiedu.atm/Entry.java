import java.util.Scanner;
public class Entry{
		String zhanghao="370120180104";
		long mima=123456;
		public void Login(User user){
			while(true){
			Scanner sr=new Scanner(System.in);
			System.out.println("qingshuruzhanghao:");
			String zh=sr.next();
			if(zh.length()==12){
			System.out.println("qingshurumima:");
			long mm=sr.nextLong();
			if(zh==zhanghao&&mm==mima){
				Menu menu=new Menu();
				menu.carte(user);
			}
				else{
				System.out.println("shuruyouwu,qingchongxiuchuru:");
				Entry1 entry=new Entry1();
				entry.Login(user);
		}
	}
			else{
				System.out.println("changduyouwu,qingchongxinshuru");
				
			}
		}
	
		
}
}