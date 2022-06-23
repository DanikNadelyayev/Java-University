package Task5_6;

import Task2.HomeTextiles;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(List<HomeTextiles> textilesList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("/Users/smirnovandrey/Desktop/учеба/JavaUniversity/src/main/java/Task5_6/homeTextileList.csv"))) {

            textilesList.forEach((HomeTextiles h) -> {
                writer.println(h.getHeaders());
                writer.println(h.toCsv());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
