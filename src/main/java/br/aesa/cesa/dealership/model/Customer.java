package main.java.br.aesa.cesa.dealership.model;

public class Customer extends Person {
    private String phone;
    private String date;
    private String cnh;
    private String cnhCategory;

    public Customer() {
        super();
    }

    public Customer(String name, String cpf, String phone, String date, String cnh, String cnhCategory) {
        super(name, cpf);
        this.phone = phone;
        this.date = date;
        this.cnh = cnh;
        this.cnhCategory = cnhCategory;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCnhCategory() {
        return cnhCategory;
    }

    public void setCnhCategory(String cnhCategory) {
        this.cnhCategory = cnhCategory;
    }
}
