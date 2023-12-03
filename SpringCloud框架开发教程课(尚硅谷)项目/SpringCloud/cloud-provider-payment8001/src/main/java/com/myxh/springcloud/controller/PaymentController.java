package com.myxh.springcloud.controller;

import com.myxh.springcloud.entities.CommonResult;
import com.myxh.springcloud.entities.Payment;
import com.myxh.springcloud.service.PaymentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author MYXH
 * @date 2023/12/2
 */
@Slf4j
@RestController()
@RequestMapping("/payment")
public class PaymentController
{
    @Resource
    PaymentService paymentService;

    @PostMapping("create")
    public CommonResult<Integer> create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("----- 插入结果：" + result);

        if (result > 0)
        {
            return new CommonResult<>(200, "插入数据库成功", result);
        }
        else
        {
            return new CommonResult<>(404, "插入数据库失败", null);
        }
    }

    @GetMapping("get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("----- 查询结果：" + payment);

        if (payment != null)
        {
            return new CommonResult<>(200, "查询成功", payment);
        }
        else
        {
            return new CommonResult<>(404, "查询失败，没有对应记录，查询 ID：" + id, null);
        }
    }
}
