package tech.chillo.products.repository;


import org.springframework.data.repository.CrudRepository;
import tech.chillo.products.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

   //select * from product where name = param;
    Iterable <Product> findByName(String name);

    //select * from product where name LIKE param;
    Iterable <Product> findByNameContainingOrderByPriceDesc(String name);

    Iterable <Product> findByPriceAfter(int price);

}
