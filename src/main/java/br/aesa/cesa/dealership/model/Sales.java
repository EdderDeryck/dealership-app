package main.java.br.aesa.cesa.dealership.model;

public class Sales {
    private Customer customer;
    private Motorcycles motorcycles;
    private String sale_date;
    public Sales(Customer customer, Motorcycles motorcycles, String sale_date){
        this.customer = customer;
        this.motorcycles = motorcycles;
        this.sale_date = sale_date;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMotorcycles(Motorcycles motorcycles) {
        this.motorcycles = motorcycles;
    }

    public void setPrice(String sale_date) {
        this.sale_date = sale_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getSaleDate() {
        return sale_date;
    }

    public Motorcycles getMotorcycles() {
        return motorcycles;


    }
    public void showSaleDetails(){
        System.out.printf("Vendas");
        System.out.printf("Data da verda: "+ this.getSaleDate());
    }
}
