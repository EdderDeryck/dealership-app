package main.java.br.aesa.cesa.dealership;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Edder Deryck", "12345678900", "81999999999", "2002-10-10", "123456", "A");
        Motorcycles motorcycle = new Motorcycles("Honda", "CB 300R", "Vermelha", 18000.00);
        Sale sale = new Sale(customer, motorcycle, "2025-10-06");

        customer.introduce();
        sale.showSaleDetails();

        if (customer.canRideMotorcycle()) {
            System.out.println("O cliente está autorizado a pilotar esta motocicleta.");
        } else {
            System.out.println("O cliente NÃO possui categoria adequada na CNH.");
        }
    }
}
