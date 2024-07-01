public class User 
{
  private String userName;
  private int userPin;
  private String accountNo;
  private double balance;
  private int cvv;
  private int monthOfExpiry;
  private int yearOfExpiry;

  public User(String userName,int userPin,String accountNo,double balance,int cvv,int monthOfExpiry,int yearOfExpiry){
    this.userName=userName;
    this.userPin=userPin;
    this.accountNo=accountNo;
    this.balance=balance;
    this.cvv=cvv;
    this.monthOfExpiry=monthOfExpiry;
    this.yearOfExpiry=yearOfExpiry;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
     this.userName=userName;
  }

  public int getUserPin() {
     return this.userPin;
  }

  public void setUserPin(int userPin){
    this.userPin=userPin;
  }

  public String getAccountNo(){
    return this.accountNo;
  }

  public void setAccountNo(String accountNo){
    this.accountNo=accountNo;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){
    this.balance=balance;
  }

  public int getCvv(){
    return this.cvv;
  }

  public void setCvv(int cvv){
    this.cvv=cvv;
  }

  public void setMonthAndYearOfExpiry(int month,int year){
    this.monthOfExpiry=month;
    this.yearOfExpiry=year;
  }

  public int getMonthOfExpiry(){
    return this.monthOfExpiry;
  }

  public int getYearOfExpiry(){
    return this.yearOfExpiry;
  }
  
}
