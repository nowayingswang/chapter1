package com.smart.service;

import com.smart.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * Created by wang on 2017/7/15.
 */
public class CustomerService {

    /**
     * 获取客户数据列表
     */
    public List<Customer> getCustomerList(){
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        return false;
    }
}