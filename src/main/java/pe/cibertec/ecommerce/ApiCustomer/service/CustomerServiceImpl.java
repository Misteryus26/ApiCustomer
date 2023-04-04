/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomer.DAO.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private  CustomerRepository customerRepository;
            
    @Override
    public List<Customer> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (List < Customer >)customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return customerRepository.findById(id).orElse(null);
        
    }
    
}
