package com.task2;

public class HomeTextiles  {
    public int height, width;
    public String type = "Default"; // Textile type


    public String toString() {
        return String.format("Type: %s \nHeight: %d cm \nWidth: %d cm", type, height, width);
    }
}

