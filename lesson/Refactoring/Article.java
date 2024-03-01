// 雑誌論文のデータ
public class Article extends Paper {
    private String journal;
    private int volume;
    private int number;
    private int startpage;
    private int endpage;
    private int year;

    public Article(String authors, String title, String journal,int volume, int startpage, int endpage, int year) {
        super(authors, title, startpage, endpage, year);
        this.journal = journal;
        this.volume = volume;
        this.number = -1;
    }
    public Article(String authors, String title, String journal, int volume, int number, int startpage, int endpage, int year) {
        this(authors, title, journal, volume, startpage, endpage, year);
        this.number = number;
    }

    public void printInfo() {
		System.out.printf("* %s:\n", this.authors);
        System.out.printf("  %s.\n", this.title);
        if (this.number > 0) {
            System.out.printf("  %s, Vol. %d, No. %d, pp. %d-%d (%d).\n",
                this.journal, this.volume, this.number, this.startpage, this.endpage, this.year);
        } else {
            System.out.printf("  %s, Vol. %d, pp. %d-%d (%d).\n",
                this.journal, this.volume, this.startpage, this.endpage, this.year);
        }
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }

}
