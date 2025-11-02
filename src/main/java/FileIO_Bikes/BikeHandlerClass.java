package FileIO_Bikes;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BikeHandlerClass {


    // diese Methode ließt das übergebene File ein und verarbeitet die eingelesenen Zeilen

    public static List<Bike> manageBikes(String filename) {
        List<Bike> bikeList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                String name = parts[0];
                double power = Double.parseDouble(parts[1]);
                double weight = Double.parseDouble(parts[2]);
                double price = Double.parseDouble(parts[3]);

                bikeList.add(new Bike(name, power, weight, price));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bikeList;
    }


    /*
     * diese Methode übernimmt eine Textdatei
     * verarbeitet sei dann mit der "manageBikes" Methode und erstellt eine Liste alles Bikes
     * erstellt eine weitere Liste für die Ausgabe Datei
     * sortiert die Bikes nach 2 Kriterien und gibt sie dann jweils in die Liste für das Event
     * schreibt die Bikes aus der EventList in ein neues File
     */


    public static void bikesForEvent (String filename) {
        List<Bike> bikeList = manageBikes(filename);


        List<Bike> eventBikeList = new ArrayList<>();

        bikeList.sort(new PowerComparator());
        eventBikeList.add(bikeList.get(0));
        eventBikeList.add(bikeList.get(1));

        bikeList.sort(new NormalizedPowerComparator());
        eventBikeList.add(bikeList.get(0));
        eventBikeList.add(bikeList.get(1));



        try(BufferedWriter bw = new BufferedWriter(new FileWriter("event_bikes.txt"))){
            for (Bike bike : eventBikeList){
                bw.write(bike.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
