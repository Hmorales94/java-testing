package com.platzi.test.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
    private PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

    //Antes de ejecutar un test, se corre la inicialización
    @Before
    public void setup(){

        //Se crea el mock de la interfaz no implementada
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

    }

    @Test
    public void makePayment_isCorrect_true(){

        //Mockito.any()) funciona como comodín para las pruebas
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        boolean result = paymentProcessor.makePayment(new BigDecimal(1000));
        assertTrue(result);

    }

    @Test
    public void makePayment_isWrong_false(){

        //Mockito.any()) funciona como comodín para las pruebas
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(new BigDecimal(1000));
        assertFalse(result);

    }


}