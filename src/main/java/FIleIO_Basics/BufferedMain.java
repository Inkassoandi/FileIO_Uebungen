package FIleIO_Basics;

import java.io.*;
import java.util.ArrayList;


public class BufferedMain {
    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello World");
            bw.newLine();
            bw.write("Ich bin Alex");
            bw.newLine();
            bw.write("Files einzulesen und auszugeben ist mein Leben!");
            bw.newLine();
            bw.write("Das ist die vierte Zeile");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ArrayList<String> zeilen = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                zeilen.add(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(zeilen.get(2));
    }
}
