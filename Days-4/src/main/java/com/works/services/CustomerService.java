package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerDto;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;
    final TinkEncDec tinkEncDec;
    final ModelMapper modelMapper;
    final HttpServletRequest req;

    public ResponseEntity save(Customer customer) {
        try {
            String newPass = tinkEncDec.encrypt(customer.getPassword());
            customer.setPassword(newPass);
            customerRepository.save(customer);
            return new ResponseEntity(customer, HttpStatus.OK);
        }catch (Exception ex) {
            return new ResponseEntity(customer, HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity login(Customer customer) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmailEqualsIgnoreCase(customer.getEmail());
        if (optionalCustomer.isPresent() ) {
            Customer c = optionalCustomer.get();
            String newPass = tinkEncDec.decrypt(c.getPassword());
            if ( newPass.equals(customer.getPassword()) ) {
                // Login Success
                // session create
                req.getSession().setAttribute("user", c);
                CustomerDto dto = modelMapper.map(c, CustomerDto.class);
                return new ResponseEntity(dto, HttpStatus.OK);
            }
        }
        return new ResponseEntity("Email or Password Error!", HttpStatus.BAD_REQUEST);
    }


}
