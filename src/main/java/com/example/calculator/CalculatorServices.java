package com.example.calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorServices {
    @RequestMapping("/add/{number1}/{number2}")
    public CalculatorModel getCalculatedAddedValue(@PathVariable int number1 , @PathVariable int number2 ) {
        return new CalculatorModel(number1, number2, new AddServices().addServices(number1, number2));
    }
    @RequestMapping({"/sub/{number1}/{number2}"})
    public CalculatorModel getCalculatedSubtractedValue(@PathVariable int number1 , @PathVariable int number2 ) {
        return new CalculatorModel(number1, number2, new SubtractionServices().subServices(number1, number2));
    }
}
