package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class AddServices {
    public  int  addServices(int number1, int number2) {
        return (number1+number2);
    }
}
