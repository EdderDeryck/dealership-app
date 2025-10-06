package main.java.br.aesa.cesa.dealership;


public class Motorcycles {

    private String name;
    private String model;
    private String color;
    private double price;

    public Motorcycles(String name, String model, String color, double price) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}






