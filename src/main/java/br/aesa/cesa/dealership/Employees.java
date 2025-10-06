package main.java.br.aesa.cesa.dealership;

public class Employees extends Person {
    private String role;
    public Employees(String role, String name, String cpf){
        super(cpf, name);
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    @Override
    public  void introduce(){
        System.out.printf("Funcionario");
        System.out.printf("Nome: "+ this.getName());
        System.out.printf("CPF: "+ this.getCpf());
        System.out.printf("Cargo: "+ this.getRole());
    }
}
