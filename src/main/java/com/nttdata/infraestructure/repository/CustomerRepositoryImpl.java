package com.nttdata.infraestructure.repository;

import com.nttdata.domain.contract.CustomerRepository;
import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.entity.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@ApplicationScoped
public class CustomerRepositoryImpl implements CustomerRepository {

  @Override
  public List<Customer> getAllCustomer() {
    return Customer.listAll();
  }

  @Override
  @Transactional
  public Customer addCustomer(CustomerDto customerDto) {

    return null;
  }


  private static String getDateNow(){
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return formatter.format(date).toString();
  }
}
