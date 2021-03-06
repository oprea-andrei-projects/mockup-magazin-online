package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Customers;
import ro.mycodescool.repository.CustomersRepository;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCustomersTest {

    @Test
    void test_addCustomer(){

        ControllerCustomers controllerCustomers = new ControllerCustomers();

        Customers c = new Customers("mail","pass","full-name","ba","dsa","rom","0823");

        controllerCustomers.add(c);
    }

    @Test
    void test_deleteCustomer(){

        ControllerCustomers controllerCustomers  = new ControllerCustomers();

        controllerCustomers.deleteCustomer(5);
    }

    @Test
    void test_getCustomers(){

        CustomersRepository customersRepository = new CustomersRepository();

        for(Customers c: customersRepository.getAllCustomers()){

            System.out.println(c);
        }
    }





}