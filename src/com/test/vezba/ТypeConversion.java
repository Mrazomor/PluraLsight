package com.test.vezba;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ТypeConversion {

    public static void main(String[] args){

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) byteVal;

        short result2 = (short) (byteVal - longVal);

        float result3 = longVal - floatVal;

       long result4 = (long) (shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success");

    }
}
