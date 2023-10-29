package com.devstack.pos.util;

import java.util.Random;

public class KeyGenerator {
    private static final Random RANDOM =new Random();

    public static long generateId(){
        long maxValue= Long.MAX_VALUE;
        return (long)(RANDOM.nextDouble()*maxValue);
    }
}
