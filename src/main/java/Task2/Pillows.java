package Task2;

public class Pillows extends HomeTextiles {

    String typeOfPillows = "Travel pillow";

    public Pillows() {

    }

    public String getTypeOfPillows() {
        return typeOfPillows;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "typeOfPillows";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getTypeOfPillows();
    }
}
