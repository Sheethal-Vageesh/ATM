public class CurrencyCompositionClass 
{
  private int fiveHundredNotes;
  private int twoHundredNotes;
  private int oneHundredNotes;
  private int fiftyNotes;
  private int twentyNotes;
  private int tenNotes;

  public CurrencyCompositionClass(int fiveHundred,int twoHundred,int oneHundred,int fifty,int twenty,int ten)
  {
    this.fiveHundredNotes=fiveHundred;
    this.twoHundredNotes=twoHundred;
    this.oneHundredNotes=oneHundred;
    this.fiftyNotes=fifty;
    this.twentyNotes=twenty;
    this.tenNotes=ten;
  }

  public int getFiveHundred(){
    return this.fiveHundredNotes;
  }

  public int getTwoHundred(){
    return this.twoHundredNotes;
  }

  public int getOneHundred(){
    return this.oneHundredNotes;
  }

  public int getFifty(){
    return this.fiftyNotes;
  }

  public int getTwenty(){
    return this.twentyNotes;
  }

  public int getTen(){
    return this.tenNotes;
  }

  public void setFiveHundred(int fiveHundred){
     this.fiveHundredNotes=fiveHundred;
  }

  public void setTwoHundred(int twoHundredNotes){
    this.twoHundredNotes=twoHundredNotes;
 }

 public void setOneHundred(int oneHundredNotes){
  this.oneHundredNotes=oneHundredNotes;
}

public void setFifty(int fiftyNotes){
  this.fiftyNotes=fiftyNotes;
}

public void setTwenty(int twentyNotes){
  this.twentyNotes=twentyNotes;
}

public void setTen(int tenNotes){
  this.tenNotes=tenNotes;
}



}

