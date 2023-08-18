package com.works.restcontrollers;

import com.works.entities.Product;
import com.works.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductRestController {

    final ProductService productService;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/list/{cid}/{page}")
    public ResponseEntity list(@PathVariable long cid, @PathVariable int page) {
        return productService.list(cid, page);
    }

}
