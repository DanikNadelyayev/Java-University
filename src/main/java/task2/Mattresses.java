package task2;

public class Mattresses extends HomeTextiles {

    String typeOfMattress = "orthopedic";

    public Mattresses() {

    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "typeOfMattress";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getTypeOfMattress();
    }

    public String getTypeOfMattress() {
        return typeOfMattress;
    }
}
