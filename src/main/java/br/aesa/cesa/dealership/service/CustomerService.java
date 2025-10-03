package main.java.br.aesa.cesa.dealership.service;

import main.java.br.aesa.cesa.dealership.model.Customer;
import main.java.br.aesa.cesa.dealership.repository.CustomerRepository;
import java.util.List;

public class CustomerService }
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) }
        this.repo = repo;
    }

    public boolean registerCustomer(String name, String cpf) {
        if (repo.findByCpf(cpf) != null) {
            System.out.println("Erro: já existe um cliente com esse CPF!");
            return false;
        }
        repo.add(new Customer(name, cpf));
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }

    public List<Customer> listCustomers() {
        return repo.list();
    }

    public Customer findCustomer(String cpf) {
        return repo.findByCpf(cpf);
    }

    public boolean removeCustomer(String cpf) {
        return repo.remove(cpf);
    }

    public boolean canRideMotorcycle(Customer customer) {
        String cat = customer.getCnhCategory();
        return cat != null && cat.contains("A");
    }
}