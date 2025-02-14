package tech.chillo.products.repository;


import org.springframework.data.repository.CrudRepository;
import tech.chillo.products.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {
}
