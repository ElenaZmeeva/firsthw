package com.example.firsthw;

import net.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class CalculatorParamsTest {

    private final  CalculatorServiceImpl out = new CalculatorServiceImpl();


@ParameterizedTest
@MethodSource("paramsTest")
    public void findAmountTest (int num1, int num2){
        Assertions.assertEquals(num1+num2,out.calculator (num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramsTest")
    public void findMinusTest (int num1, int num2) {
        Assertions.assertEquals(num1 - num2, out.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramsTest")
    public void findMultiplyTest (int num1, int num2) {
        Assertions.assertEquals(num1 * num2, out.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("paramsTest")
    public void findDivideTest (int num1, int num2) {
        Assertions.assertEquals(num1 / num2, out.divide(num1, num2));
    }

    public static Stream<Arguments> paramsTest(){
     return Stream.of(
             Arguments.of(1,2),
             Arguments.of(2,2),
             Arguments.of(2,0),
             Arguments.of(3,1)
     );
    }

}
