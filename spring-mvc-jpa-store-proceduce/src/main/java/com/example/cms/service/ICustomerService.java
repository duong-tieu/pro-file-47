package com.example.cms.service;

import com.example.cms.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
