public enum Verdict 
{
   SUCCESS("Success"),
   FAILURE("Failure"),
   OUT_OF_MONEY("Out of money"),
   MAXIMUM_LIMIT("Maximum limit"),
   SOFTWARE_ERROR("Software error"),
   HARDWARE_ERROR("Hardware error");

   private final String val;

   Verdict(String val)
   {
    this.val=val;
   }

   public String getVal()
   {
    return this.val;
   }
}
