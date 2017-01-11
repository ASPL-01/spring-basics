package com.allstate.models;

import java.util.stream.Stream;

public class Math {
    public static int square(int x){
        return x * x;
    }

    public static int factorial(int x){
        return Stream.iterate(1, n -> n + 1).limit(x).reduce(1, (acc, cur) -> acc * cur);
    }

    public static int fibonacci(int x){
        if(x < 2)
            return x;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
