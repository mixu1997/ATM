import java.text.SimpleDateFormat;
import java.util.Date;
public class Time{
	public void time(){
		Date date=new Date();
		SimpleDateFormat sp=new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
		String str=sp.format(date);
		System.out.println(str);
	}
}