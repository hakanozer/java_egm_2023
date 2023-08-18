package com.works.services;

import com.works.entities.Product;
import com.works.projections.IProCat;
import com.works.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    final ProductRepository productRepository;

    public ResponseEntity save(Product product) {
        productRepository.save(product);
        return new ResponseEntity(product, HttpStatus.OK);
    }

    public ResponseEntity list() {
        List<IProCat> products = productRepository.allProCat();
        return new ResponseEntity(products, HttpStatus.OK);
    }

}
