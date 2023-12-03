package com.myxh.springcloud.service.impl;

import com.myxh.springcloud.dao.PaymentDao;
import com.myxh.springcloud.entities.Payment;
import com.myxh.springcloud.service.PaymentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author MYXH
 * @date 2023/12/2
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
