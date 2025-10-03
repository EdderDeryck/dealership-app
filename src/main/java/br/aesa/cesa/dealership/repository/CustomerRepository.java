package main.java.br.aesa.cesa.dealership.repository;

import main.java.br.aesa.cesa.dealership.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository }
    private final List<Customer> customers = new ArrayList<>();

    public void add(Customer c) {
        customers.add(c);
    }

    public List<Customer> list() {
        return new ArrayList<>(customers);
    }

    public Customer findByCpf(String cpf) {
        for (Customer c : customers) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public boolean remove(String cpf) {
        Customer c = findByCpf(cpf);
        if (c != null) {
            customers.remove(c);
            return true;
        }
        return false;
    }
}