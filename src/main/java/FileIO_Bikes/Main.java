package FileIO_Bikes;

import java.util.List;

import static FileIO_Bikes.BikeHandlerClass.bikesForEvent;
import static FileIO_Bikes.BikeHandlerClass.manageBikes;

public class Main {
    public static void main(String[] args) {

        // hier wird die Datei "tuned_bikes.txt" einmal verarbeitet und zur kontrolle ausgegeben
        List<Bike> bikeList = manageBikes("tuned_bikes.txt");
        bikeList.forEach(System.out::println);

        /*
         * mit dieser Methode wird:
         *      - eine Datei übergeben
         *      - alle Bikes darin verarbeitet
         *      - und eine neue Datei mit den 4 gesuchten Bikes erstellt
         */

        bikesForEvent("tuned_bikes.txt");

    }
}
