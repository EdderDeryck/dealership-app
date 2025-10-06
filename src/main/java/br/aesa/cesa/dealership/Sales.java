package main.java.br.aesa.cesa.dealership;

public class Sales {
    private Customer customer;
    private Motorcycles motorcycles;
    private float price;
    public Sales(Customer customer, Motorcycles motorcycles, float price){
        this.customer = customer;
        this.motorcycles = motorcycles;
        this.price = price;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMotorcycles(Motorcycles motorcycles) {
        this.motorcycles = motorcycles;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getPrice() {
        return price;
    }

    public Motorcycles getMotorcycles() {
        return motorcycles;
    }
}
