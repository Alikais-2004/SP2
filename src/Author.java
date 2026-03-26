import java.util.ArrayList;

public class Author {

    String name;
    ArrayList<Title> titles;

    public Author(String name){
        this.name=name;
        this.titles = new ArrayList<>();

    }

    void addTitle(Title title){
       titles.add(title);
    }

    double calculateRoyalties(){

        double total=0;

        for(Title t: titles){

            total+=t.calculateRoyalty();
        }
        return Math.round(total*100.0)/100.0;
    }

    String getName(){
        return name;
    }

}
