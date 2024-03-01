public class AddressData {
  private String name;
  private String metropolice;
  private String city;
  private String zipcode;

  private AddressData() {}
  public AddressData(String aName, String aMetropolice, String aCity, String aZipcode) {
    if(null == aName || null == aMetropolice || null == aCity || null == aZipcode) {
      throw new NullPointerException();
    }
    this.name = aName;
    this.metropolice = aMetropolice;
    this.city = aCity;
    this.zipcode = aZipcode;
  }

  public String getName() {
    return this.name;
  }
  public String getAddress() {
    return this.city + ", " + this.metropolice + ", " + this.zipcode;
  }
  public String toString() {
    return this.name + ": " + this.city + ", " + this.metropolice + ", " + this.zipcode;
  }
}