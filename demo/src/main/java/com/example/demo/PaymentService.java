package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String validate(double amount, String cardNumber) {
        if (amount > 0 && cardNumber != null && cardNumber.length() == 16) {
            return "SUCCESS";
        }
        return "FAILURE";
    }
}
