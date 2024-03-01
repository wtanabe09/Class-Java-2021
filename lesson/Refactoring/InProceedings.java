// 会議論文のデータ
public class InProceedings extends Paper {
    private String conference;
    

    public InProceedings(String authors, String title, String conference,
			 int startpage, int endpage, int year) {
        this.authors = authors;
        this.title = title;
        this.conference = conference;
        this.startpage = startpage;
        this.endpage = endpage;
        this.year = year;
    }

    public void printInfo() {
        System.out.printf("* %s:\n", this.authors);
        System.out.printf("  %s.\n", this.title);
        System.out.printf("  %s, pp. %d-%d (%d).\n", this.conference, this.startpage, this.endpage, this.year);
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
}
