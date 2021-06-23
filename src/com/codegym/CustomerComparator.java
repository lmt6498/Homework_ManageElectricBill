package com.codegym;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getCustomerID() > o2.getCustomerID()) {
            return 1;
        } else return -1;
    }
}
