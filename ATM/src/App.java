import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);

       MachineFeatures machineFeatures=new  MachineFeatures();

       ATM atm1=machineFeatures.createATM("ATM087",new Location("karnataka","mysore","India","571006","--","k r nagar"),new CurrencyCompositionClass(50,60,100,500,850,900));
       
       machineFeatures.seeComposition(atm1);

       User user1=new User("Sheethal", 1999, "782541977", 20000, 9855, 8, 2025);
       
       System.out.println(user1.getUserName()+" has balance of : "+ machineFeatures.checkBalance(user1));

      System.out.println("please enter the amount ");
      long amount=sc.nextLong();
      machineFeatures.withdraw(atm1,user1,amount);

       machineFeatures.seeComposition(atm1);

       sc.close();
    }
}
