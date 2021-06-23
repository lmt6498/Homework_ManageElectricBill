package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manage {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> list = new ArrayList<>();

    public static void addVNCustomer(int customerID, String customerName, String invoiceDate, double amount, double price, double quota) {
        list.add(new VNCustomer(customerID, customerName, invoiceDate, amount, price, quota));
    }

    public static void addForeignCustomer(int customerID, String customerName, String invoiceDate, double amount, double price, String nationality) {
        list.add(new ForeignCustomer(customerID, customerName, invoiceDate, amount, price, nationality));
    }

    public static void updateCustomer(int customerID) {
        for (Customer s : list) {
            if (s.getCustomerID() == customerID) {
                if (s instanceof VNCustomer) {
                    System.out.println("Nhập tên khách hàng: ");
                    String customerName = sc.nextLine();
                    System.out.println("Nhập ngày ra hóa đơn: ");
                    String invoiceDate = sc.nextLine();
                    System.out.println("Nhập số lượng điện tiêu thụ: ");
                    Double amout = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số tiền điện: ");
                    Double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số định mức: ");
                    Double quota = Double.parseDouble(sc.nextLine());
                    ((VNCustomer) s).setCustomerName(customerName);
                    ((VNCustomer) s).setInvoiceDate(invoiceDate);
                    ((VNCustomer) s).setAmount(amout);
                    ((VNCustomer) s).setPrice(price);
                    ((VNCustomer) s).setQuota(quota);
                } else if (s instanceof ForeignCustomer) {
                    System.out.println("Nhập tên khách hàng: ");
                    String customerName = sc.nextLine();
                    System.out.println("Nhập quốc tịch: ");
                    String nationality = sc.nextLine();
                    System.out.println("Nhập ngày ra hóa đơn: ");
                    String invoiceDate = sc.nextLine();
                    System.out.println("Nhập số lượng điện tiêu thụ: ");
                    Double amout = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số tiền điện: ");
                    Double price = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số định mức: ");
                    Double quota = Double.parseDouble(sc.nextLine());
                    ((ForeignCustomer) s).setCustomerName(customerName);
                    ((ForeignCustomer) s).setNationality(nationality);
                    ((ForeignCustomer) s).setInvoiceDate(invoiceDate);
                    ((ForeignCustomer) s).setAmount(amout);
                    ((ForeignCustomer) s).setPrice(price);
                }
            }
        }
    }

    public static void removeByID(int customerID) {
        Customer target = null;
        for (Customer s : list) {
            if (s.getCustomerID() == customerID) {
                target = s;
            }
        }
        list.remove(target);
    }

    static void findByName() {
        System.out.println("Nhập tên: ");
        String nameSearch = sc.nextLine();
        for (Customer s : list) {
            if (s instanceof VNCustomer) {
                if (((VNCustomer) s).getCustomerName().equals(nameSearch)) {
                    s.display();
                }
            } else if (s instanceof ForeignCustomer) {
                if (((ForeignCustomer) s).getCustomerName().equals(nameSearch)) {
                    s.display();
                }
            }
        }
    }

    static void findByID() {
        CustomerComparator sortByID = new CustomerComparator();
        list.sort(sortByID);
        System.out.println("Nhập id:");
        int id = sc.nextInt();
        int index = Collections.binarySearch(list, new Customer(id, null, null, 0, 0), sortByID);
        System.out.println(list.get(index));
    }

    static void sortByID() {
        Comparator idComparator = new CustomerComparator();
        list.sort(idComparator);
    }

    public static void show() {
        for (Customer s : list) {
            s.display();
        }
    }

}
