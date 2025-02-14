package tech.chillo.products.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.chillo.products.entity.Product;
import tech.chillo.products.service.ProductService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping(path="product", produces = APPLICATION_JSON_VALUE)
public class ProductController {

    private ProductService productService;

    @GetMapping
    public Iterable<Product> search(){
        return this.productService.search();
    }
}
