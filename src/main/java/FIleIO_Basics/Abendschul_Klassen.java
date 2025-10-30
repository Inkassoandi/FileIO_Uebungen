package FIleIO_Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;

public class Abendschul_Klassen {
    public static void main(String[] args) {

        /*
         * Wir erstellen eine Textdatei mit dem Namen "Schüler der Abendschule" und befüllen sie mit Schülern.
         * Sowohl Informatiker als auch Elektrotechniker
         * dazu verwenden wir den BufferedWriter
         */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Schüler der Abendschule.txt"))){

            bw.write("    Alexander Regenfelder 5AAIF    ");
            bw.newLine();
            bw.write(" Thomas Brandtner 5AAIF        ");
            bw.newLine();
            bw.write("Jaquline Kores 5AAET ");
            bw.newLine();
            bw.write("Gabriel Urach 5AAET ");
            bw.newLine();
            bw.write("          Melanie Marschnig 5AAET ");
            bw.newLine();
            bw.write(" Sarah Felsberger 5AAIF ");
            bw.newLine();
            bw.write("Alexander Messner 5AAIF    ");
            bw.newLine();
            bw.write("    Romeo Reiner 5AAET ");
            bw.newLine();
            bw.write("      David Ortner 5AAIF        ");
            bw.newLine();
            bw.write(" Jakop SolarTesla 5AAET ");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        /*
         * Jetzt wollen wir die erstellte Liste einlesen.
         * Die Informatiker sowie die Elektrotechniker sollen jeweils einer eigenen Textdatei zugeteilt werden.
         */



        // Zuerst sortieren wir die Schüler in 2 Listen
        ArrayList<String> informatiker = new ArrayList<>(); // wir erstellen eine Liste für die 5AAIF
        ArrayList<String> elektrotechniker = new ArrayList<>();  // wir erstellen eine Liste für die 5AAET


        // hier lesen wir nacheinander die Zeilen der Datei "Schüler der Abendschule.txt"
        try(BufferedReader br = new BufferedReader(new FileReader("Schüler der Abendschule.txt"))){

            String line;    // wir erstellen einen String in dem die eingelesene Zeile gespeichert wird
            //Beispiel: "" (momentan noch leer)

            while ((line = br.readLine()) != null){     // "while" also so lange es eine Zeile zu lesen gibt, wird der Code im Body ausgeführt
                //Beispiel: "    Alexander Regenfelder 5AAIF    "

                line = line.strip();   // mit strip werden alle Leerzeichen vor und nach dem Satz entfernt
                //Beispiel: "Alexander Regenfelder 5AAIF"

                String[] satzTeile = line.split(" ");   // wir erstellen ein StingArray "String[]" um einzelne Satzteile abspeichern zu können. Wir nehmen die Zeile "line" und teilen sie bei jedem Leerzeichen in einzelne Satzteile.
                /*
                Beispiel: "Alexander" "Regenfelder" "5AAIF"
                satzTeile[0] = "Alexander"
                satzTeile[1] = "Regenfelder"
                satzTeile[2] = "5AAIF"
                 */


                //Hier schauen wir, in welche Klasse der Schüler geht.
                if (Objects.equals(satzTeile[2], "5AAIF")){     // Dazu vergleichen wir den Wert des Arrays an der Stelle [2] mit dem Namen der Klasse(5AAIF) ---- 2.Variante (split[2] == "5AAIF") -- aber bei String nicht so praktisch
                    informatiker.add(line);     // geht er in die 5AAIF kommt er in die Liste Informatiker
                } else {
                    elektrotechniker.add(line);     // wenn nicht, dann kommt er in die Liste der Elektrotechniker
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        /*
         * Jetzt schreiben wir die Namen der Schüler in neue Textdateien für die Klassen
         */


        // Wir erstellen eine Textdatei mit dem Namen für die Informatiker und befüllen sie mit den Schülern der 5AAIT
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Klassenliste 5AAIF.txt"))){

            for (int i = 0; i < informatiker.size(); i++) {     // in der Schleife gehen wir über die gesamte Liste der "informatiker"
                bw.write(informatiker.get(i));      // und schreiben den Schüler an der Stelle "i" der Liste, in die Textdatei
                bw.newLine();       // wir springen in die Nächste Zeile
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Dasselbe machen wir für die Elektrotechniker
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Klassenliste 5AAET.txt"))){

            for (String s : elektrotechniker) {     // hier verwenden wir eine "for each" Schleife, macht im Prinzip das Gleiche
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
