public class AudioBook extends Title {

    int durationInMinutes;
    int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType);
        this.copies=copies;
        this.durationInMinutes=durationInMinutes;

    }


    @Override
    double calculatePoints() {
        return (durationInMinutes*0.5)*convertLiteraturType()*copies;
    }
}



