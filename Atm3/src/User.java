
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
	private String password;
	private String name;
	private String sex;
	private String id;
	private String xl;
	private String site;
	private String account;
	private double balance;
	private ArrayList<String> recode = new ArrayList<>();
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		 return password;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		 return name;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		 return sex;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		 return id;
	}
	public void setXl(String xl) {
		this.xl=xl;
	}
	public String getXl() {
		 return xl;
	}
	public void setSite(String site) {
		this.site=site;
	}
	public String getSite() {
		 return site;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		 return balance;
	}
	public ArrayList<String> getRecode() {
		return recode;
	}
	public void setRecode(ArrayList<String> recode) {
		this.recode = recode;
	}
	public User(String account, String password, String name, String sex, String id, String xl,
			String site, double balance) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.xl = xl;
		this.site = site;
		this.balance = balance;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "账号=" + account + ", 密码=" + password + ", 开户名=" + name + ", 性别=" + sex + ", 身份证号=" + id + ", 学历="
				+ xl + ", 地址=" + site + ", 余额=" + balance  + "\n";
	}
	
	
}