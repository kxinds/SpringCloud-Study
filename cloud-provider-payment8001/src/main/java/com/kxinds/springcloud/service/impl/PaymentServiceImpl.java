package com.kxinds.springcloud.service.impl;

import com.kxinds.springcloud.dao.PaymentDao;
import com.kxinds.springcloud.service.PaymentService;
import com.kxinds.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author EiletXie
 * @Since 2020/3/9 12:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment){

        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
