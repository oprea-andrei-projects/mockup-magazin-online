package ro.mycodescool;

import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        ControllerProducts controllerProducts = new ControllerProducts();


        controllerProducts.seeZeroStock();





    }
}
