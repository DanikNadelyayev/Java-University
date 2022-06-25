package task2;

public class Curtains extends HomeTextiles {
    public String material = "silk";

    public Curtains() {

    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "silk";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getMaterial();
    }

    public String getMaterial() {
        return material;
    }
}


