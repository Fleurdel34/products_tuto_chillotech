package tech.chillo.products.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.chillo.products.entity.Product;
import tech.chillo.products.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public Iterable<Product> search(){
        return this.productRepository.findAll();
    }

    public void initializeProducts(){
        final List<Product> products = IntStream.range(30, 100).mapToObj(index->
                     Product.builder()
                                .name("Product " + index)
                                .price(index * 100)
                                .build()
        ).collect(Collectors.toList());

        this.productRepository.saveAll(products);
    }
}
