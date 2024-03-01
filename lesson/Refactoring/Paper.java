public class Paper {
  private String authors;
  private String title;
  private int startpage;
  private int endpage;
  private int year;

  public Paper(String authors, String title, int startpage, int endpage, int year) {
    this.authors = authors;
    this.title = title;
    this.startpage = startpage;
    this.endpage = endpage;
    this.year = year;
  }
  public void printTitle() {
    System.out.println("* %s:\n", this.title);
  }
  abstract public void printAdditionalInfo();
  public void printInfo() {
    System.out.println("* %s:\n", this.authors);
    System.out.println("* %s:\n", this.authors);
  }
}