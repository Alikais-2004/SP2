
public class PrintedBook extends Title {


    int pages;
    int copies;

    public PrintedBook(String title, String literaturType, int copies, int pages){

        super(title,literaturType);
        this.pages=pages;
        this.copies=copies;
    }

    @Override
    double calculatePoints() {
        return pages*convertLiteraturType()*copies;
    }
}
