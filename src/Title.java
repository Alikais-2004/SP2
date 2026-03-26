public abstract class Title {

    String title;
    String literatureType;
    static final double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title=title;
        this.literatureType=literatureType;
    }

    abstract double calculatePoints();

    double calculateRoyalty(){

        return calculatePoints() * RATE;

    }

    double convertLiteraturType(){

        switch (literatureType.toUpperCase()){

            case "BI", "TE":

                return 3;

            case "LYRIK":

                return 6;

            case "SKØN":

                return 1.7;

            case "FAG":
                return 1;

            default:
                return 0;

        }
    }


}
