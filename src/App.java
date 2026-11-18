public class App {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);

        printBook(warAndPeace);
        printBook(crimeAndPunishment);

        crimeAndPunishment.setYear(1867);

        System.out.println("После изменения года:");
        printBook(crimeAndPunishment);
    }

    private static void printBook(Book book) {
        System.out.println("Название: " + book.getTitle()
                + ", автор: " + book.getAuthor().getFirstName()
                + " " + book.getAuthor().getLastName()
                + ", год: " + book.getYear());
    }
}


