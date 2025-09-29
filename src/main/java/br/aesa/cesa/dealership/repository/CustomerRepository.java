package main.java.br.aesa.cesa.dealership.repository;

import main.java.br.aesa.cesa.dealership.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final List<Customer> customer = new ArrayList<>();

    public void adicionar(Customer cliente) {
        customer.add(cliente);
    }

    public List<Customer> listar() {
        return customer;
    }
}
