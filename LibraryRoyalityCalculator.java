import java.util.ArrayList;
import java.awt.print.Book;

public class LibraryRoyalityCalculator {

public static void main(String[] args) {

    //Bruger eksemplerne fra opgavebeskrivelsen for at tjekke, om mit program udregner korrekt.
    PrintedBook printedBook7 = new PrintedBook("Steen og stoffer", "TE", 140, 72);
    AudioBook audioBook3 = new AudioBook("Syv m2 med lås", 400, "SKØN", 10);
    System.out.println("Eksempel 1: " + printedBook7 + " giver: " + printedBook7.calculatePoints() + " point.");
    System.out.println("Eksempel 1: " + printedBook7 + " giver: " + printedBook7.calculateRoyalty() + " kr. årligt.");
    System.out.println("Eksempel 2: " + audioBook3 + " giver: " + audioBook3.calculatePoints() + " point.");
    System.out.println("Eksempel 2: " + audioBook3 + " giver: " + audioBook3.calculateRoyalty() + " kr. årligt.");
    System.out.println();


    //Opretter alle bøger
    PrintedBook printedBook1 = new PrintedBook("Gopler ældes baglæns", "FAG", 10000, 324);
    PrintedBook printedBook2 = new PrintedBook("Omgivet af idioter", "FAG", 8000, 304);
    PrintedBook printedBook3 = new PrintedBook("Omgivet af psykopater", "FAG", 6000, 271);
    PrintedBook printedBook4 = new PrintedBook("Sportsdigte", "LYRIK", 5000, 88);
    PrintedBook printedBook5 = new PrintedBook("Sidste udkald for rejsende", "FAG", 4000, 208);
    PrintedBook printedBook6 = new PrintedBook("HjerneRo", "FAG", 10000, 192);

    AudioBook audioBook1 = new AudioBook("Vanedyr", 370, "FAG", 5000);
    AudioBook audioBook2 = new AudioBook("HjerneRo", 191, "FAG", 5000);


    //Printer alle bøger ud med deres antal point og årlige afkast.
    System.out.println(printedBook1 + " giver: " + printedBook1.calculatePoints() + " point.");
    System.out.println(printedBook1 + " giver: " + printedBook1.calculateRoyalty() + " kr. årligt.");
    System.out.println(printedBook2 + " giver: " + printedBook2.calculatePoints() + " point.");
    System.out.println(printedBook2 + " giver: " + printedBook2.calculateRoyalty() + " kr. årligt.");
    System.out.println(printedBook3 + " giver: " + printedBook3.calculatePoints() + " point.");
    System.out.println(printedBook3 + " giver: " + printedBook3.calculateRoyalty() + " kr. årligt.");
    System.out.println(printedBook4 + " giver: " + printedBook4.calculatePoints() + " point.");
    System.out.println(printedBook4 + " giver: " + printedBook4.calculateRoyalty() + " kr. årligt.");
    System.out.println(printedBook5 + " giver: " + printedBook5.calculatePoints() + " point.");
    System.out.println(printedBook5 + " giver: " + printedBook5.calculateRoyalty() + " kr. årligt.");
    System.out.println(printedBook6 + " giver: " + printedBook6.calculatePoints() + " point.");
    System.out.println(printedBook6 + " giver: " + printedBook6.calculateRoyalty() + " kr. årligt.");
    System.out.println(audioBook1 + " giver: " + audioBook1.calculatePoints() + " point.");
    System.out.println(audioBook1 + " giver: " + audioBook1.calculateRoyalty() + " kr. årligt.");
    System.out.println(audioBook2 + " giver: " + audioBook2.calculatePoints() + " point.");
    System.out.println(audioBook2 + " giver: " + audioBook2.calculateRoyalty() + " kr. årligt.");
    System.out.println();


    //Opretter forfattere og tilføjer deres bøger samt udskriver deres samlede årlige indtjening.
    Author author1 = new Author("Nicklas Brendborg");
    author1.addTitle(printedBook1);
    author1.addTitle(audioBook1);
    System.out.println(author1.getName() + " bliver i alt betalt " + author1.calculateTotalPay() + " kr. årligt.");

    Author author2 = new Author("Martin Riis Kastrup");
    author2.addTitle(audioBook2);
    author2.addTitle(printedBook6);
    System.out.println(author2.getName() + " bliver i alt betalt " + author2.calculateTotalPay() + " kr. årligt.");

    Author author3 = new Author("Thomas Erikson");
    author3.addTitle(printedBook2);
    author3.addTitle(printedBook3);
    System.out.println(author3.getName() + " bliver i alt betalt " + author3.calculateTotalPay() + " kr. årligt.");

    Author author4 = new Author("Jørgen Leth");
    author4.addTitle(printedBook4);
    author4.addTitle(printedBook5);
    System.out.println(author4.getName() + " bliver i alt betalt " + author4.calculateTotalPay() + "kr. årligt.");


}
}
