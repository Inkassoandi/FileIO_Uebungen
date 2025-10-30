package FIleIO_Basics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class File_Uebung01 {
    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Uebung01.txt"))) {
            bw.write("Anna 25 Wien");
            bw.newLine();
            bw.write("Lukas 31 Graz");
            bw.newLine();
            bw.write("Miriam 19 Klagenfurt");
            bw.newLine();
            bw.write("Jonas 42 Salzburg");
            bw.newLine();
            bw.write("Petra 28 Innsbruck");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        try (BufferedReader bw = new BufferedReader(new FileReader("Uebung01.txt"))) {
            String line;
            double sumAge = 0.0;
            double avgAge = 0.0;
            int count = 0;

            // Zeile Einlesen
            while ((line = bw.readLine()) != null) {
                // Wörter und Zahlen trennen
                String[] parts = line.split(" ");
                // Alter in einer Int speichern
                sumAge += Double.parseDouble(parts[1]);
                count++;
            }

            // Durchschnittsalter ausrechnen und wiedergeben
            avgAge = sumAge / count;

            System.out.printf("Das durchschnittliche Alter ist %.2f %n", avgAge);
        }


        try (BufferedReader bw = new BufferedReader(new FileReader("Uebung01.txt"))) {
            String line;

            while ((line = bw.readLine()) != null) {
                String[] parts = line.split(" ");
                int age = Integer.parseInt(parts[1]);

                if (Objects.equals(parts[2], "Graz")) {

                    System.out.printf("Person aus Graz: %n%s (%d Jahre)", parts[0], age);
                }
            }
        }

    }
}
