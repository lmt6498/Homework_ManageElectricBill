package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý cán bộ: ");
            System.out.println("1. Thêm khách hàng: ");
            System.out.println("2. Sửa khách hàng:");
            System.out.println("3. Xóa khách hàng:");
            System.out.println("4. Hiển thị:");
            System.out.println("5. Tìm theo tên:");
            System.out.println("6. Tìm theo ID:");
            System.out.println("7. Sắp xếp theo ID:");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại khách hàng:");
                    System.out.println("1. Thêm khách hàng Việt Nam: ");
                    System.out.println("2. Thêm khách hàng nước ngoài: ");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            System.out.println("Nhập ID:");
                            int idVN = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên khách hàng:");
                            String customerNameVN = sc.nextLine();
                            System.out.println("Nhập ngày xuất hóa đơn: ");
                            String invoiceDateVN = sc.nextLine();
                            System.out.println("Nhập số điện tiêu thụ: ");
                            double amountVN = Double.parseDouble(sc.nextLine());
                            System.out.println("Nhập số tiền điện: ");
                            double priceVN = Double.parseDouble(sc.nextLine());
                            System.out.println("Nhập số định mức: ");
                            double quotaVN = Double.parseDouble(sc.nextLine());

                            Manage.addVNCustomer(idVN, customerNameVN, invoiceDateVN, amountVN, priceVN, quotaVN);
                            Manage.show();

                            break;
                        case 2:
                            System.out.println("Nhập ID:");
                            int idForeign = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên khách hàng:");
                            String customerNameForeign = sc.nextLine();
                            System.out.println("Nhập ngày xuất hóa đơn: ");
                            String invoiceDateForeign = sc.nextLine();
                            System.out.println("Nhập số điện tiêu thụ: ");
                            double amountForeign = Double.parseDouble(sc.nextLine());
                            System.out.println("Nhập số tiền điện: ");
                            double priceForeign = Double.parseDouble(sc.nextLine());
                            System.out.println("Nhập quốc tịch");
                            String nationality = sc.nextLine();

                            Manage.addForeignCustomer(idForeign, customerNameForeign, invoiceDateForeign, amountForeign, priceForeign, nationality);
                            Manage.show();

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Sửa khách hàng:");

                    System.out.println("Nhập ID cần sửa");
                    int IDUpdate = Integer.parseInt(sc.nextLine());

                    Manage.updateCustomer(IDUpdate);
                    Manage.show();

                    break;
                case 3:
                    System.out.println("Nhập ID cần xóa");
                    int IDRemove = Integer.parseInt(sc.nextLine());

                    Manage.removeByID(IDRemove);
                    Manage.show();
                    break;
                case 4:
                    System.out.println("Hiển thị:");
                    Manage.show();
                    break;
                case 5:
                    System.out.println("Tìm kiếm theo tên: ");
                    Manage.findByName();
                    break;
                case 6:
                    System.out.println("Tìm kiếm theo ID: ");
                    Manage.findByID();
                    break;
                case 7:
                    System.out.println("Sắp xếp theo ID: ");
                    Manage.sortByID();
                    Manage.show();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
