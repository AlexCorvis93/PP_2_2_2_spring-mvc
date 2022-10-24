package web.models;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.year = year;
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "model :  " + getModel() +
                "  year" + getYear();
    }
}
