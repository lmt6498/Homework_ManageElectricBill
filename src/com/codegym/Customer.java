package com.codegym;

public class Customer {
    private int customerID;
    private String customerName;
    private String invoiceDate;
    private double amount;
    private double price;

    public Customer() {

    }

    public Customer(int customerID, String customerName, String invoiceDate, double amount, double price) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.price = price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public void display() {
        System.out.println("Customer{" +
                "customerID=" + getCustomerID() +
                ", customerName=" + getCustomerName() +
                ", invoiceDate=" + getInvoiceDate() +
                ", amount=" + getAmount() +
                ", price=" + getPrice() +
                '}');
    }
}
