package com.example.calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorServices {
    @RequestMapping("/{number1}/{number2}/{operator}")
    public CalculatorModel getCalculatedValue(@PathVariable int number1 , @PathVariable int number2 , @PathVariable char operator) {

        if(operator == '+')
            return new CalculatorModel(number1, number2,new AddServices().addServices(number1,number2));
        else if(operator == '-')
            return new CalculatorModel(number1,number2,operator,(number1-number2));
        else if(operator == '*')
            return new CalculatorModel(number1,number2,operator,(number1*number2));
        else if(operator == '/')
            return new CalculatorModel(number1,number2,operator,(number1/number2));
        else
            return new CalculatorModel(number1,number2,operator,0);

    }
}
