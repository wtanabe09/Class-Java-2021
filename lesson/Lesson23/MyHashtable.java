public class MyHashtable {
  private AddressData[] table;
  private int collision;

  private MyHashtable() {}
  public MyHashtable(int aMaxSize) {
    this.table = new AddressData[aMaxSize];
  }

  public AddressData get(String aKey) {
    if(null == aKey) {
      throw new NullPointerException();
    }
    return this.table[this.calculateHashCode(aKey)];
  }

  public void printAll() {
    for(int count = 0; count < this.table.length; count++) {
      System.out.println(count + "\t" + this.table[count]);
    }
    System.out.println();
  }

  public boolean put(AddressData anAddressData) {
    if(null == anAddressData) {
      return false;
    }
    if(this.table[this.calculateHashCode(anAddressData.getName())] != null) {
      collision++;
    }
    this.table[this.calculateHashCode(anAddressData.getName())] = anAddressData;
    return true;
  }

  public boolean remove(String aKey) {
    if(null == aKey) {
      return false;
    }
    this.table[this.calculateHashCode(aKey)] = null;
    return true;
  }

  private int calculateHashCode(String aKey) {
    if(null == aKey) {
      throw new NullPointerException();
    }
    int intKey = 0;
    for(int count = 0; count < aKey.length(); count++) {
      intKey += 0xffff & aKey.charAt(count);
    }
    return intKey % this.table.length;
  }

  //Lesson24_1
  public int elementNum() {
    int eleCount = 0;
    for(int i = 0; i < this.table.length; i++) {
      if(this.table[i] != null) {
        eleCount++;
      }
    }
    return eleCount;
  }
  public void clear() {
    for(int i = 0; i < this.table.length; i++) {
      if(this.table[i] != null) {
        this.table[i] = null;
      }
    }
  }

  //Lesson24_2
  public int getCollision() {
    return collision;
  }

  //Lesson24_3
  public void exists(String aKey) {
    if(null == aKey) {
      System.out.println("Key is null.");
      return;
    }
    if(get(aKey).getName().equals(aKey)) {
      System.out.println(aKey + " exists");
      System.out.println(get(aKey).toString());
      return;
    }
    System.out.println(aKey + " does not exists.");
  }

}