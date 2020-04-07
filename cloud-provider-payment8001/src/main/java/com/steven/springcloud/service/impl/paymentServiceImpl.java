package com.steven.springcloud.service.impl;

import com.steven.springcloud.dao.PaymentDao;
import com.steven.springcloud.entities.Payment;
import com.steven.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: Steven Lee
 * Created: 2020/4/1 22:34
 */
@Service
public class paymentServiceImpl implements PaymentService {
    @Resource // 依赖注入
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id) {
        return paymentDao.getPaymentById(id);
    }
}
