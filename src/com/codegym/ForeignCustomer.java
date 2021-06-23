package com.codegym;

public class ForeignCustomer extends Customer {
    private String nationality;

    public ForeignCustomer() {
    }

    public ForeignCustomer(String nationality) {
        this.nationality = nationality;
    }

    public ForeignCustomer(int customerID, String customerName, String invoiceDate, double amount, double price, String nationality) {
        super(customerID, customerName, invoiceDate, amount, price);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double totalForeign(double price, double amount) {
        double total = 0;
        total = price * amount;
        return total;
    }

    @Override
    public String toString() {
        return "ForeignCustomer{" + super.toString() +
                " nationality='" + nationality + '\'' +
                '}';
    }

    public void display() {
        System.out.println("Foreign Customer{" +
                "customerID=" + getCustomerID() +
                ", customerName=" + getCustomerName() +
                ", invoiceDate=" + getInvoiceDate() +
                ", Nationality=" + getNationality() +
                ", amount=" + getAmount() +
                ", price=" + getPrice() +
                ", totalPrice=" + totalForeign(getPrice(), getAmount()) +
                '}');
    }
}
