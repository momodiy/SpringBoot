package com.steven.springcloud.dao;

import com.steven.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author: Steven Lee
 * Created: 2020/3/19 22:43
 */
@Mapper
public interface PaymentDao {
    //  增删改查
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
