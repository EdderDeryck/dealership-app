package main.java.br.aesa.cesa.dealership.model;

public class Customer {
    private String nome;
    private String cpf;

    public Customer(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
