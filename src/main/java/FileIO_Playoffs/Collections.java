package FileIO_Playoffs;

import java.io.*;
import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) throws IOException {


        /*
         * erstellen einer Liste von Teams mit dem namen "table"
         * Zeile für Zeile alle Teams aus der Tabelle einlesen
         * aufteilen und verarbeiten der eingelesenen Zeile
         *      - Position in der Tabelle [0]
         *      - Teamname [1]
         *      - Tore und Gegentore nochmals durch ":" splitten
         *      - Die Tordifferenz berechnen
         *      - Gesamtpunkte [3]
         * das erstellte Team zur TeamListe "table" hinzufügen
         */

        ArrayList<Team> table = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Tabelle.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.strip();
                String[] parts = line.split("-");

                String tablePosition = parts[0];
                String teamName = parts[1];

                String goalsShotRecieved = parts[2];
                String[] goals = goalsShotRecieved.split(":");
                int goalDifference = Integer.parseInt(goals[0]) - Integer.parseInt(goals[1]);

                int totalPoints = Integer.parseInt(parts[3]);

                table.add(new Team(tablePosition, teamName, goalDifference, totalPoints));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        /*
         * erstellen der Textdatei für die Playofftabelle
         * sortieren und eintragen der Teams nach Position
         * sortieren und eintragen der Teams nach Tordifferenz
         */

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("PlayOff_Tabelle.txt"))) {

            table.sort(new PointsComparator());
            bw.write("1. im Playoff: " + table.get(0).getName()); bw.newLine();
            bw.write("2. im Playoff: " + table.get(1).getName()); bw.newLine();
            bw.write("3. im Playoff: " + table.get(2).getName()); bw.newLine();


            table.sort(new GoalDifferenceComparator());
            bw.write("4. im Playoff: " + table.getFirst().getName());
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
