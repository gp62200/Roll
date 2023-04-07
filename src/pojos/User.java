package pojos;

import java.sql.Date;

public class User {
	private int id;
	private String name;
	private String emailId;
	private String password;
	private double reg_amt;
	private Date reg_date;
	private String role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String emailId, String password, double reg_amt, Date reg_date, String role) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.reg_amt = reg_amt;
		this.reg_date = reg_date;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getReg_amt() {
		return reg_amt;
	}
	public void setReg_amt(double reg_amt) {
		this.reg_amt = reg_amt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + ", reg_amt="
				+ reg_amt + ", reg_date=" + reg_date + ", role=" + role + "]";
	}
	
	

}
