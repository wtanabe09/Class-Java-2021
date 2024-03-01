// Thesis 博士論文/修士論文のデータ
public class Thesis {
    private String authors;
    private String title;
    private String degree;
    private String school;
    private int year;

    public Thesis(String authors, String title, String degree, String school, int year) {
        this.authors = authors;
        this.title = title;
        this.degree = degree;
        this.school = school;
        this.year = year;
    }

    public void printInfo() {
        System.out.printf("* %s:\n", this.authors);
        System.out.printf("  %s.\n", this.title);
        System.out.printf("  %s Thesis at %s (%d).\n", this.degree, this.school, this.year);
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
}
