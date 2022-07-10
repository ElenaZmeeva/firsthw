package com.example.firsthw;

public class ZeroException extends  IllegalArgumentException{

    public ZeroException (){
        super("Делить на ноль нельзя");
    }
}
