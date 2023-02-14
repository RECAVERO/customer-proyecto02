package com.nttdata.btask.service;

import com.nttdata.btask.interfaces.CustomerService;
import com.nttdata.domain.contract.CustomerRepository;
import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.entity.Customer;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> getAllCustomer() {
    return customerRepository.getAllCustomer();
  }

  @Override
  public Customer addCustomer(CustomerDto customerDto) {
    return customerRepository.addCustomer(customerDto);
  }

}
