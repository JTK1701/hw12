
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Лукьяненко");
        Author author2 = new Author("Clifford", "Simak");
        Book book1 = new Book(2020, author1, "Л - Значит люди");
        Book book2 = new Book(1963, author2, "Way Station");
        book1.setYearOfPublishing(1999);
        System.out.println(book1);
        System.out.println(book2);
    }
}
