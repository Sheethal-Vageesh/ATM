public enum CurrencyComposition 
{
 FIVE_HUNDRED("Five Hundred Note",500),
 TWO_HUNDRED("Two Hundred Note",200),
 ONE_HUNDRED("One Hundred Note",100),
 FIFTY("Fifty Note",50),
 TWENTY("Twenty Note",20),
 TEN("Ten Note",10);

 private String text;
 private int value;

 CurrencyComposition(String text,int value)
 {
    this.text=text;
    this.value=value;
 }

 public String getText(){
    return this.text;
 }

 public int getValue(){
    return this.value;
 }
}
