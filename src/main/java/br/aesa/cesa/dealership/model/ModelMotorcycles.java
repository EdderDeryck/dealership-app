package main.java.br.aesa.cesa.dealership.model;

public class ModelMotorcycles {
    private String model;
    private float price;

    void setModel(String model) {
        this.model = model;
    }
    void setPrice(float price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public float getPrice() {
        return price;
    }
}
