import java.text.SimpleDateFormat;
import java.util.Date;
public class Time{
	public void time(){
		Date date=new Date();
		SimpleDateFormat sp=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String str=sp.format(date);
		System.out.println(str);
	}
}