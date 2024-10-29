import java.awt.print.Book;
import java.util.ArrayList;
public class Author {

    private String name;

    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title t){
        titles.add(t);
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public float calculateTotalPay() {
        float totalPay = 0;

        for(Title t : titles){
            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }

    public String getName() { //Har valgt at tilføje en getter, så jeg kan få forfatternes navne printet ud i main.
        return name;
    }

}
