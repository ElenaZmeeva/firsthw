package com.example.firsthw;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome(){
        return "Добро пожаловать в калькулятор.";
    }
    @Override
    public int calculator ( int num1, int num2){
        return num1+num2;
    }
    @Override
    public int minus ( int num1, int num2){
        return num1-num2;
    }
    @Override
    public int multiply( int num1, int num2){
        return num1*num2;
    }
    @Override
    public int divide ( int num1, int num2){
        if ( num2==0){
            throw new ZeroException();
        }
        return num1/num2;
    }
}
