package com.example.cms.repository;

import com.example.cms.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Transactional
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        String sql = " CALL Insert_Customer(:firstName, :lastName)";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("firstName", customer.getFirstName());
        query.setParameter("lastName", customer.getLastName());
        return query.executeUpdate() == 0;
    }
}
