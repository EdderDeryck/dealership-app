package br.com.motoapp.model;

public class Moto {

    private String name;
    private String model;
    private String color;
    private double price;

    public Moto() {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getters
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


    public void displayMoto() {
        System.out.println("Motorcycle: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Price: R$" + this.price);
    }
}
