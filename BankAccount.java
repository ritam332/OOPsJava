package mycodes;

import java.lang.reflect.Method;
public class BankAcc {
	private String accNo; ;
	private double accBalance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNo;
	
	
	public void deposit(double depositAmount) {
		accBalance += depositAmount;
		
	}
	
	public void withdrawl(double withdrawlAmount) {
		if (this.accBalance - withdrawlAmount < 0) {
			System.out.println("");
		} else {
			accBalance-=withdrawlAmount;
			System.out.println(" ");
		}
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	

}