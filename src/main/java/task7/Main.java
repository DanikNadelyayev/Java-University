package task7;

import java.util.ArrayList;

import static task7.FindExtra.findWords;

public class Main {
    public static void main(String[] args) {
        String input = "This bus is going away";
        String text = "I bought this car two days ago. My bus is going at school";
        ArrayList<String> s = findWords(input, text);
        for (String p: s) {
            System.out.println(p);
        }
    }

}