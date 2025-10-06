package main.java.br.aesa.cesa.dealership;

public class Main {
    public static void main(String[] args) {
        Customer cliente = new Customer(
                "Deryck Silva",
                "12345678901",
                "85999999999",
                "2002-03-15",
                "98765432100",
                "A"
        );

        Motorcycles moto = new Motorcycles(
                "Yamaha",
                "MT-03",
                "Preta",
                36500.0
        );

        Sale venda = new Sale(cliente, moto, "2025-10-06");

        cliente.introduce();
        venda.showSaleDetails();

        if (cliente.canRideMotorcycle()) {
            System.out.println(cliente.getName() + " está autorizado a pilotar motocicletas!");
        } else {
            System.out.println(cliente.getName() + " NÃO está autorizado a pilotar motocicletas!");
        }
    }
}
