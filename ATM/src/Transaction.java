import java.time.LocalDateTime;

public class Transaction 
{
  private double transactionAmount;
  private TransactionType transactionType;
  private long transactionId;
  private LocalDateTime dateOfTransaction;
  private Verdict verdict;
  private Location location;

  public Transaction(double transactionAmount,TransactionType transactionType,long transactionId,LocalDateTime dateOfTransaction,Verdict verdict,Location location)
  {
    this.transactionAmount=transactionAmount;
    this.dateOfTransaction=dateOfTransaction;
    this.transactionId=transactionId;
    this.location=location;
    this.transactionType=transactionType;
    this.verdict=verdict;
  }

  public double getTransactionAmount(){
    return this.transactionAmount;
  }

  public TransactionType getTransactionType(){
    return this.transactionType;
  }

  public long getTransactionId(){
    return this.transactionId;
  }

  public LocalDateTime getDateOfTransaction(){
    return this.dateOfTransaction;
  }

  public Verdict getVerdict(){
     return this.verdict;
  }

  public Location getLocation(){
    return this.location;
  }
}
