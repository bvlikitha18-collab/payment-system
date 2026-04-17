package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    PaymentService service = new PaymentService();

    @Test
    void testValidPayment() {
        assertEquals("SUCCESS", service.validate(100.0, "1234567812345678"));
    }

    @Test
    void testInvalidPayment() {
        assertEquals("FAILURE", service.validate(-50.0, "123"));
    }
}
