package com.task3;

public class HomeTextiles1 {
    public int height, width;
    public int i = 0;
    public String type = "Default"; // Textile type

    public HomeTextiles1 (int height, int width, String type) {
    this.height = height;
    this.width = width;
    this.type = type;

    }

    public String toString() {
        return String.format("Type: %s \nHeight: %d cm \nWidth: %d cm", type, height, width);
    }
}
