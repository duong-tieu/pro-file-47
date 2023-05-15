package com.example.cms.repository;

import com.example.cms.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
