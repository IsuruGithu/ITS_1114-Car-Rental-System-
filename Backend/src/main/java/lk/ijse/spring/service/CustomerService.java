package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;

import java.util.List;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

public interface CustomerService {

    void saveCustomer(CustomerDTO dto);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO dto);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomers();
}
