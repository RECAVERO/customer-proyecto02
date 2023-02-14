package com.nttdata.domain.contract;

import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.entity.Customer;
import io.smallrye.mutiny.Multi;

import java.util.List;

public interface CustomerRepository {
  List<Customer> getAllCustomer();
  Customer addCustomer(CustomerDto customerDto);


}
