import java.time.LocalDateTime;
import java.util.*;

public class MachineFeatures 
{
  public ATM createATM(String atmId,Location location,CurrencyCompositionClass composition){
    return new ATM(atmId,location,composition);
  }

  public void updateATMLocation(ATM atm,Location location){
    atm.setLocation(location);
  }

  public void updateComposition(ATM atm,CurrencyCompositionClass composition){
    atm.setCurrencyComposition(composition);
  }

  public void seeComposition(ATM atm){
    CurrencyCompositionClass composition=atm.getCurrencyComposition();
    System.out.println("ATM composition is : ");
    System.out.println("-----------------------------------");
    System.out.println("$500 notes - "+composition.getFiveHundred());
    System.out.println("$200 notes - "+composition.getTwoHundred());
    System.out.println("$100 notes - "+composition.getOneHundred());
    System.out.println("$50 notes - "+composition.getFifty());
    System.out.println("$20 notes - "+composition.getTwenty());
    System.out.println("$10 notes - "+composition.getTen());
    System.out.println("-------------------------------------");
  }

  public double  checkBalance(User user){
    return user.getBalance();
  }

  public long checkATMBalance(ATM atm) {
    return atm.getBalance();
  }

  public void withdraw(ATM atm,User user,long amount)
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("please enter your pin : ");
     int pin=sc.nextInt();
     if(pin!=user.getUserPin())
     {
      System.out.println("Incorrect pin , please enter correct pin");
      return;
     }
    if(!(atm.getCondition().getVal().equals("Working")))
    {
      System.out.println("The ATM is at "+atm.getCondition().getVal()+" you can't withdraw the money");
      Transaction transaction=new Transaction(amount, TransactionType.FAILED, amount, LocalDateTime.now(),Verdict.FAILURE,atm.getLocation());
      atm.getListOfTranscations().add(transaction);
      return;
    }
    if(amount>checkBalance(user)){
      System.out.println("Insufficient balance, withdraw unsuccesfull...");
      Transaction transaction=new Transaction(amount, TransactionType.FAILED, amount, LocalDateTime.now(),Verdict.FAILURE,atm.getLocation());
      atm.getListOfTranscations().add(transaction);
      return;
    }
    if(amount>checkATMBalance(atm)){
      System.out.println("We are out of fund, withdraw unsuccessfull...");
      Transaction transaction=new Transaction(amount, TransactionType.FAILED, amount, LocalDateTime.now(),Verdict.OUT_OF_MONEY,atm.getLocation());
      atm.getListOfTranscations().add(transaction);
      return;
    }
    System.out.println("Withdraw successfull...\nplease collect the amount ");
    user.setBalance(user.getBalance()-amount);
    Transaction transaction=new Transaction(amount, TransactionType.DEBIT, amount, LocalDateTime.now(),Verdict.SUCCESS,atm.getLocation());
      atm.getListOfTranscations().add(transaction);
    updateCompositionNotes(atm,amount);
    System.out.println("The user balance is : "+user.getBalance());

  }

  private void updateCompositionNotes(ATM atm,double amount)
  {
     CurrencyCompositionClass composition = atm.getCurrencyComposition();
     
     int fivehundred=(int)(amount/500);
     if(composition.getFiveHundred()>=fivehundred)
     {
      amount-=fivehundred*500;
      composition.setFiveHundred(composition.getFiveHundred()-fivehundred);
     }

     int twohundred=(int)(amount/200);
     if(composition.getTwoHundred()>=twohundred)
     {
      amount-=twohundred*200;
      composition.setTwoHundred(composition.getTwoHundred()-twohundred);
     }

     int oneHundred=(int)(amount/100);
     if(composition.getOneHundred()>=oneHundred)
     {
      amount-=oneHundred*100;
      composition.setOneHundred(composition.getOneHundred()-oneHundred);
     }

     int fifty=(int)(amount/50);
     if(composition.getFifty()>=fifty)
     {
      amount-=fifty*50;
      composition.setFifty(composition.getFifty()-fifty);
     }

    int twenty=(int)(amount/20);
    if(composition.getTwenty()>=twenty)
    {
     amount-=twenty*20;
     composition.setTwenty(composition.getTwenty()-twenty);
    }

   int ten=(int)(amount/10);
   if(composition.getTen()>=ten)
   {
    amount-=ten*10;
    composition.setTen(composition.getTen()-ten);
   }
  }
}
