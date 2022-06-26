package task2;

public class BedSheets extends HomeTextiles {
    public String colour = "White";

    public BedSheets() {
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "colour";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getColour();
    }

    public String getColour() {
        return colour;
    }
}
