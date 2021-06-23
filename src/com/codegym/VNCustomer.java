package com.codegym;

public class VNCustomer extends Customer {
    private double quota;

    public VNCustomer() {

    }

    public VNCustomer(double quota) {
        this.quota = quota;
    }

    public VNCustomer(int customerID, String customerName, String invoiceDate, double amount, double price, double quota) {
        super(customerID, customerName, invoiceDate, amount, price);
        this.quota = quota;
    }

    public double totalVN(double amount, double price, double quota) {
        double total = 0;
        if (amount <= quota) {
            total = amount * price;
        } else {
            total = amount * price * ((amount - quota) * price * 2.5);
        }
        return total;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "VNCustomer{" +
                "quota=" + quota +
                '}';
    }

    public void display() {
        System.out.println("Việt Nam Customer{" +
                "customerID=" + getCustomerID() +
                ", customerName=" + getCustomerName() +
                ", invoiceDate=" + getInvoiceDate() +
                ", amount=" + getAmount() +
                ", price=" + getPrice() +
                ", quota=" + getQuota() +
                ", totalPrice=" + totalVN(getAmount(), getPrice(), getQuota()) +
                '}');
    }
}
