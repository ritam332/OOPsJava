package mycodes2;

public class ClassBankAccount {
    private String number;
    private double balance;

    private String customerName;
    private String customerEmail;
    private String customerPhoneNum;

    public ClassBankAccount() {
        System.out.println("Empty constructor called");
    }

    public ClassBankAccount(String number, double balance, String customerName,
            String customerEmail, String customerPhoneNum) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNum = customerPhoneNum;
    }
    
    

    public ClassBankAccount(String customerName, String customerEmail,
			String customerPhoneNum) {
		this("99999",100.55,customerName,customerEmail,customerPhoneNum);
		
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNum = customerPhoneNum;
	}

	public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        } else {
            balance -= withdrawalAmount;
            System.out
                    .println("Withdrawal of " + withdrawalAmount + " processed . Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    // .................................................................................
    public static void main(String[] args) {
        ClassBankAccount RitamsAcc = new ClassBankAccount("12345", 0.00,
                "Ritam", "abc@gmail.com", "9330939167");

        System.out.println(RitamsAcc.getCustomerName());
        System.out.println(RitamsAcc.getNumber());
        System.out.println(RitamsAcc.getCustomerPhoneNum());
        System.out.println(RitamsAcc.getCustomerEmail());
        System.out.println(RitamsAcc.getBalance());
        ClassBankAccount timAcc= new ClassBankAccount("Tim","tim@gmail.com", "93309");

        System.out.println(timAcc.getCustomerEmail());
        
        RitamsAcc.setCustomerName("Tim");
        System.out.println(RitamsAcc.getCustomerName());

        RitamsAcc.deposit(350);
        RitamsAcc.withdrawal(100.0);

        RitamsAcc.deposit(500);
        RitamsAcc.withdrawal(200);

        RitamsAcc.withdrawal(500);

    }

}
