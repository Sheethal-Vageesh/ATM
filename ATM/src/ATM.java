import java.util.*;

public class ATM 
{
  private String atmId;
  private Location location;
  private CurrencyCompositionClass currencyComposition;
  private long balance;
  private Condition condition;
  private List<Transaction> listOfTransaction=new ArrayList<>();

  public ATM(String atmId,Location location,CurrencyCompositionClass currencyComposition)
  {
    this.atmId=atmId;
    this.location=location;
    this.currencyComposition=currencyComposition;
    this.balance=computeBalance(currencyComposition);
    this.condition=Condition.WORKING;
  }

  public String getAtmId(){
    return this.atmId;
  }

  public Location getLocation(){
    return this.location;
  }

  public void setLocation(Location location){
    this.location=location;
  }

  public CurrencyCompositionClass  getCurrencyComposition(){
    return this.currencyComposition;
  }

  public void setCurrencyComposition(CurrencyCompositionClass composition){
    this.currencyComposition=composition;
  }

  public Condition getCondition(){
    return this.condition;
  }

  public List<Transaction> getListOfTranscations(){
    return this.listOfTransaction;
  }

  private long computeBalance(CurrencyCompositionClass currencyComposition){
    int bal=currencyComposition.getFiveHundred()*500 + currencyComposition.getTwoHundred()*200 + currencyComposition.getOneHundred()*100 + 
    currencyComposition.getFifty()*50  +  currencyComposition.getTwenty()*20  +  currencyComposition.getTen()*10;
    return bal;
  }

  public long getBalance(){
     return this.balance;
  }
}
