package ro.mycodescool.repository;

import ro.mycodescool.model.Products;

import java.time.LocalDate;

public class ProductsRepository extends SQL{


    public ProductsRepository(){

        super();
    }

    public void insertProducts(Products p){

        String deInserat = "";
        deInserat +=
                String.format("insert into magazin.products(name,price,weight,description,category,create_date,stock) " +
                        "values ('%s',%d,%d,'%s','%s','%s',%d) ",
                        p.getName(),p.getPrice(),p.getWeight(),p.getDescription(),p.getCategory(),
                      p.getDate(),p.getStock());





        System.out.println(deInserat);executeStatement(deInserat);

    }



    public void deleteProduct(int id){

        String deSters = String.format("delete from magazin.products where id =%d",id);

        executeStatement(deSters);
    }

    public void updateName(int id, String newName){

        String updateName = String.format("update magazin.products set name='%s' where id=%d",newName,id);

        executeStatement(updateName);


    }

    public void updatePrice(int id, int newPrice){
        String updatePrice = String.format("update magazin.products set price=%d where id=%d",newPrice,id);
        executeStatement(updatePrice);
    }

    public void updateWeight(int id, int newWeight){

        String updateWeight = String.format("update magazin.products set weight=%d where id=%d",newWeight,id);
        executeStatement(updateWeight);

    }

    public void updateDescription(int id, String newDescription){

        String updateDesc = String.format("update magazin.products set description='%s' where id=%d",newDescription,id);

        executeStatement(updateDesc);
    }

    public void updateCat(int id, String newCat){

        String updateCat = String.format("update magazin.products set category='%s' where id=%d",newCat,id);

        executeStatement(updateCat);
    }

    public void updateDate(int id, LocalDate newDate){

        String updateDate = String.format("update magazin.products set create_date='%s' where id=%d",newDate,id);

        executeStatement(updateDate);
    }




}
