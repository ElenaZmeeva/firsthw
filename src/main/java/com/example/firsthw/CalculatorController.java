package com.example.firsthw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
    }

    @GetMapping
    public String welcome(){
        return calculatorService.welcome();
    }
    @GetMapping (path = "/plus")
    public int calculator (@RequestParam("num1") int num1, @RequestParam ("num2") int num2){
        return calculatorService.calculator(5,5);
    }
    @GetMapping (path = "/minus")
    public int minus ( @RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.minus(5,5);
    }
    @GetMapping (path = "/multiply")
    public int multiply ( @RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.multiply(5,5);
    }
    @GetMapping (path = "/divide")
    public int divide ( @RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.divide(5,5);
    }
}
