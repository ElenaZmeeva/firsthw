package com.example.firsthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
private final  CalculatorServiceImpl out = new CalculatorServiceImpl();

        @Test
        public void findAmount (){
            Assertions.assertEquals(3,out.calculator (1,2));
        }

    @Test
    public void findMinus() {
        Assertions.assertEquals(1,out.minus (3,2));
    }
    @Test
    public void findMultiply() {
        Assertions.assertEquals(2,out.multiply (1,2));
    }
    @Test
    public void findDivide() {
        Assertions.assertEquals(3,out.divide (3,1));
    }
    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->out.divide(3,0));

    }
}


