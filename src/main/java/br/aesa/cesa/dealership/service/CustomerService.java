package main.java.br.aesa.cesa.dealership.service;

import main.java.br.aesa.cesa.dealership.repository.CustomerRepository;
import main.java.br.aesa.cesa.dealership.model.Customer;
import java.util.List;

public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public boolean cadastrarCustomer(String nome, String cpf) {
        if (repo.buscarPorCpf(cpf) != null) {
            System.out.println("Erro: já existe um cliente com esse CPF!");
            return false;
        }
        repo.adicionar(new Customer(nome, cpf));
        System.out.println("Cliente cadastrado com sucesso!");
        return true;
    }

    public List<Customer> listarCustomers() {
        return repo.listar();
    }

    public Customer buscarCustomer(String cpf) {
        return repo.buscarPorCpf(cpf);
    }

    public boolean removerCustomer(String cpf) {
        return repo.remover(cpf);
    }

    public boolean podePilotarMoto(Customer customer) {
        return customer.getCnhCategory() != null && customer.getCnhCategory().contains("A");
    }
}
