package main.java.br.aesa.cesa.dealership;

public abstract class Person {
    private String name;
    private String cpf;

    public Person() {
    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public boolean validateCpf() {
        return this.cpf != null && this.cpf.length() == 11;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract void introduce();
}
