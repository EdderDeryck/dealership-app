package main.java.br.aesa.cesa.dealership.service;

import main.java.br.aesa.cesa.dealership.repository.CustomerRepository;
import main.java.br.aesa.cesa.dealership.model.Customer;
import java.util.List;

public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public void cadastrarCustomer(String nome, String cpf) {
        for (Customer c : repo.listar()) {
            if (c.getCpf().equals(cpf)) {
                System.out.println("Erro: já existe um cliente com esse CPF!");
                return;
            }
        }
        repo.adicionar(new Customer(nome, cpf));
        System.out.println("Customer cadastrado com sucesso!");
    }

    public List<Customer> listarCustomers() {
        return repo.listar();
    }
}
