package com.steven.springcloud.service;

import com.steven.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Author: Steven Lee
 * Created: 2020/3/19 23:35
 */
@Service

public interface PaymentService {
    //    24
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
