
public class LibraryRoyaltyCalculator {

    void main() {

        Author author = new Author("Ali Kais");

        PrintedBook book1 = new PrintedBook("De fire Soldater", "TE", 10, 200);
        PrintedBook book2 = new PrintedBook("De fire politimænd", "TE", 20, 300);


        AudioBook audio = new AudioBook("Harry Potter", "FAG", 50, 120);

        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(audio);

        System.out.println("Forfatter: " + author.getName());
        System.out.println("Samlet bibliotekspenge: " + author.calculateRoyalties());

    }
}