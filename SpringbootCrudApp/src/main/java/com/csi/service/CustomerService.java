package com.csi.service;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepoImpl;

    public Customer save(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> findAll(){
        return customerRepoImpl.findAll();
    }

    public Optional<Customer> findById(int custId){
        return customerRepoImpl.findById(custId);
    }

    public Customer updataData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public  void deleteById(int custId){
        customerRepoImpl.deleteById(custId);
    }
    public  void deleteAll(){
        customerRepoImpl.deleteAll();
    }
}
