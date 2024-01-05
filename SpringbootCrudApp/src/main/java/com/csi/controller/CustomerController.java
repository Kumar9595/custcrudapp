package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/csi")
public class CustomerController {

    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return ResponseEntity.ok(customerServiceImpl.save(customer));
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerServiceImpl.findAll());
    }

    @GetMapping("/findbyid/{custId}")
    public ResponseEntity<Optional<Customer>> findById(@PathVariable int custId){
        return ResponseEntity.ok(customerServiceImpl.findById(custId));
    }
    @PutMapping("/updatedata/{custId}")
    public ResponseEntity<Customer> updateData(@RequestBody Customer customer, @PathVariable int custId){
        return ResponseEntity.ok(customerServiceImpl.save(customer));
    }
    @DeleteMapping("/deletebyid/{custId}")
    public ResponseEntity<String> deleteById(@PathVariable int custId){
        customerServiceImpl.deleteById(custId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }
    @DeleteMapping("/deleteall")
    public ResponseEntity<String> deleteAll(){
        customerServiceImpl.deleteAll();
        return ResponseEntity.ok("ALL DATA DELETED");
    }
}
