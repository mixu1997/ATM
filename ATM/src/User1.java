import java.io.Serializable;

public class User1 implements Serializable{
	private int money;
	/* private int number;//转账账号 */
	private int sum;//转账金额
	private String qtime;
	private String ctime;
	private String ztime;
	private	long zhanghao=370120180104L;
	private	long mima=123456;
	private long number1=370120180108L;
	private int mm1=654321;
	private String name1="爱国者";
	public User1(int money) {
		this.money=money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	/* public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	} */
	public void setSum(int sum){
		this.sum=sum;
	}
	public int getSum(){
		return sum;
	}
	public void setQtime(String qtime){
		this.qtime=qtime;
	}
	public String getQtime(){
		return qtime;
	}
	public void setCtime(String ctime){
		this.ctime=ctime;
	}
	public String getCtime(){
		return ctime;
	}
	public void setZtime(String ztime){
		this.ztime=ztime;
	}
	public String getZtime(){
		return ztime;
	}
	public long getNumber1(){
		return number1;
	}
	public int getMm1(){
		return mm1;
	}
	public long getZhanghao(){
		return zhanghao;
	}
	public long getMima(){
		return mima;
	}
	



}