package com.myxh.springcloud.service;

import com.myxh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author MYXH
 * @date 2023/12/2
 */
public interface PaymentService
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
