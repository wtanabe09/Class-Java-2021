public class ChainHashTable {
  private MyLinkedList[] table;
  private ChainHashTable() {}
  public ChainHashTable(int aMaxSize) {
    this.table = new MyLinkedList[aMaxSize];
  }

  public AddressData get(String aKey) {
    if(null == aKey) {
      throw new NullPointerException();
    }
    MyLinkedList list = this.table[this.calculateHashCode(aKey)];
    if(null == list) {
      return null;
    }
    int limit = list.size();
    int count = 1;
    AddressData address = null;
    while(count <= limit) {
      address = (AddressData)list.get(count);
      if(address.getName().equals(aKey)) {
        return address;
      }
      count++;
    }
    return null;
  }
  public void printAll() {}
  public boolean put(AddressData anAddressData) {}
  private int calculateHashCode(String aKey) {}
}