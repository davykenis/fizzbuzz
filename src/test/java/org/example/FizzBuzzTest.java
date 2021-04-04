package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class FizzBuzzTest
{
    @Test
    public void FizzBuzz_0is0()
    {
        assertEquals("0",FizzBuzz.of(0));
    }

    @Test
    public void FizzBuzz_1is1(){
        assertEquals("1",FizzBuzz.of(1));
    }

    @Test
    public void FizzBuzz_3isFizz(){
        assertEquals("Fizz",FizzBuzz.of(3));
    }

    @Test
    public void FizzBuzz_5isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(5));
    }
    @Test
    public void FizzBuzz_15isFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.of(15));
    }

    @Test
    public void FizzBuzz_LowerThenZero(){
        assertEquals("-1",FizzBuzz.of(-1));
    }









    /**
    @Test
    public void FizzBuzz_1is1()
    {
        assertEquals("1",FizzBuzz.of(1));
    }
    @Test
    public void FizzBuzz_3isFizz()
    {
        assertEquals("Fizz",FizzBuzz.of(3));
    }
    @Test
    public void FizzBuzz_5isBuzz()
    {
        assertEquals("Buzz",FizzBuzz.of(5));
    }
    @Test
    public void FizzBuzz_6isFizz(){
        assertEquals("Fizz",FizzBuzz.of(6));
    }
    @Test
    public void FizzBuzz_10isBuzz(){
        assertEquals("Buzz",FizzBuzz.of(10));
    }
    @Test
    public void FizzBuzz_15isFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.of(15));
    }
    **/
}
