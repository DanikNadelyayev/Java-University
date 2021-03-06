package task2;

public class HomeTextiles {
    private int height, width;
    private String type = "Default"; // Textile type

    public HomeTextiles(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;

    }

    public HomeTextiles() {
    }


    public String toString() {
        return String.format
                ("Type: %s \nHeight: %d cm \nWidth: %d cm", type, height, width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public String getHeaders() {
        return "height" + "," + "width" + "," + "type";
    }

    public String toCsv() {
        return getType() + "," + getWidth() + "," + getHeight();
    }


}



