package Task2;

import java.util.ArrayList;

public class HomeTextiles {
    public int height, width;
    public String type = "Default"; // Textile type

    public HomeTextiles(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;

    }
    public HomeTextiles() {}


    public String toString() {
        return String.format("Type: %s \nHeight: %d cm \nWidth: %d cm", type, height, width);
    }
}

