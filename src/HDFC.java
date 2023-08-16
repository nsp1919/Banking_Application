import java.util.UUID;

public class HDFC implements BankAccount{

    //need some attributes
    private String accountNumber;

    private String customerName;
    private String password;
    private double amount;

    //If no one want to change ine value in future then final is used
    final double ROI=7.1;
    final String IFSCCode="HDFC0002";

    public HDFC() {
    }

    public HDFC(String customerName, String password, double amount) {
        this.customerName = customerName;
        this.password = password;
        this.amount = amount;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getROI() {
        return ROI;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String checkBalance(String password) {
        if (this.password.equals(password))
            return "Available balance is: "+this.amount;
        return  "Password is incorrect, please enter correct password";
    }

    @Override
    public String addMoney(int amount) {
        this.amount+=amount;
        return "Amount of Rs."+amount+" has been added successfully, updated balance is: "+this.amount;
    }

    @Override
    public String withdrawMoney(int amount, String password) {

        if (this.password.equals(password)) {
            if (this.amount >= amount) {
                this.amount -= amount;
                return "Amount of Rs." + amount + " has been withdraw successfully, updated balance is: " + this.amount;
            } else return "Insufficient balance";
        }
        return "Password is incorrect, please enter correct password";

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Password changed successfully";
        }
        return "Password is incorrect, please enter correct password";
    }

    @Override
    public double Interest(int year) {
        return (this.amount*year*ROI)/100.0;
    }

    @Override
    public String toString() {
        return "HDFC{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", ROI=" + ROI +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
