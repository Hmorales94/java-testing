package com.platzi.test.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
