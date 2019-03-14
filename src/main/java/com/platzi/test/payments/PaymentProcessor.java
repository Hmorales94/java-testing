package com.platzi.test.payments;

import java.math.BigDecimal;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(BigDecimal amount){

        PaymentResponse paymentResponse = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(paymentResponse.getStatus() == PaymentResponse.PaymentStatus.OK)
            return true;
        else
            return false;
    }
}
