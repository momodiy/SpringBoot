package com.steven.springcloud.controller;

import com.steven.springcloud.entities.CommonResult;
import com.steven.springcloud.entities.Payment;
import com.steven.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: Steven Lee
 * Created: 2020/4/1 22:45
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**插入结果**" + result);
        if (result > 0) {
            return new CommonResult(200, "插入结果成功", result);
        } else {
            return new CommonResult(418, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("**查询结果**" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(418, "没有对应记录，查询id:" + id, null);
        }
    }
}
