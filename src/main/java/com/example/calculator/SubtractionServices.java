package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class SubtractionServices {
    public int subServices(int number1, int number2) {
        return (number1-number2);
    }
}
