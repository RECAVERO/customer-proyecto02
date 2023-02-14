package com.nttdata.application.controller;

import com.nttdata.btask.interfaces.CustomerService;
import com.nttdata.domain.models.CustomerDto;
import io.smallrye.mutiny.Multi;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;



@Path("/customer")
public class CustomerController {
  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GET
  public Response getAllCustomer(){
    return Response.ok(customerService.getAllCustomer()).status(200).build();
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addCustomer(CustomerDto customerDto){
    return Response.ok(customerService.addCustomer(customerDto)).status(201).build();
  }

}
