public enum Condition 
{
    WORKING("Working"),
    TECHNICAL_ERROR("Technical error"),
    OUT_OF_BALANCE("Out of balance"),
    ABANDONED("Abandoned");

    private final String val;

    Condition(String val)
    {
        this.val=val;
    }
 
    public String getVal()
    {
        return this.val;
    }
}
