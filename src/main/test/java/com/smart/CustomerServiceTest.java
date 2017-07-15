package com.smart;

import com.smart.model.Customer;
import com.smart.service.CustomerService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 测试类
 * Created by wang on 2017/7/15.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    //初始化数据库
    @Before
    public void init(){

    }

    @Test
    public void getCustomerListTest(){
        List<Customer> customerList = customerService.getCustomerList();
    }
}
