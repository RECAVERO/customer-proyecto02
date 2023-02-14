package com.nttdata.btask.interfaces;

import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.entity.Customer;
import io.smallrye.mutiny.Multi;

import java.util.List;

public interface CustomerService {
  List<Customer> getAllCustomer();
  Customer addCustomer(CustomerDto customerDto);
}
