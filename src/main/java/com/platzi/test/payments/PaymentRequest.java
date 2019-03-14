package com.platzi.test.payments;

import java.math.BigDecimal;

public class PaymentRequest {

    private BigDecimal amount;

    public PaymentRequest(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
