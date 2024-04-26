public class Book {
    private int yearOfPublishing;
    private Author name;
    private String title;

    public Book(int yerOfPublishing, Author name, String title) {
        this.yearOfPublishing = yerOfPublishing;
        this.title = title;
        this.name = name;
    }


    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public Author getName() {
        return this.name;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
