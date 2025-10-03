package main.java.br.aesa.cesa.dealership.service;

import main.java.br.aesa.cesa.dealership.repository.CustomerRepository;
import main.java.br.aesa.cesa.dealership.model.Customer;
import java.util.List;

public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public boolean registerCustomer(String name, String cpf) {
        if (repo.searchByCpf(cpf) != null) {
            System.out.println("Erro: já existe um cliente com esse CPF!");
            return false;
        }
        repo.adicionar(new Customer(nome, cpf));
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }

    public List<Customer> listCustomers() {
        return repo.listar();
    }

    public Customer registerCustomer(String cpf) {
        return repo.searchByCpf(cpf);
    }

    public boolean removeCustomer(String cpf) {
        return repo.remove(cpf);
    }

    public boolean podePilotarMoto(Customer customer) {
        return customer.getCnhCategory() != null && customer.getCnhCategory().contains("A");
    }
}
