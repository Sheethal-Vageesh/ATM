public class Location 
{
  private String state;
  private String city;
  private String country;
  private String zipCode;
  private String zone;
  private String address;

  public Location(String state,String city,String country, String zipCode, String zone, String address)
  {
    this.country=country;
    this.city=city;
    this.state=state;
    this.zipCode=zipCode;
    this.zone=zone;
    this.address=address;
  }

  public void getLocation()
  {
    System.out.println("country : "+this.country);
    System.out.println("state : "+this.state);
    System.out.println("city : "+this.city);
    System.out.println("zip Code : "+this.zipCode);
    System.out.println("zone : "+this.zone);
    System.out.println("address : "+this.address);
  }

}
