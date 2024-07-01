public enum TransactionType 
{
  CREDIT("Credit"),
  DEBIT("Debit"),
  FAILED("Failed");

  private final String val;

  TransactionType(String val)
  {
    this.val=val;
  }

  public String getVal()
  {
    return this.val;
  }

}
