package org.example;
public class FizzBuzz {
    public static String of(int i) {
        if (i == 0)
            return "0";

        return getBuzzWord(i);
    }

/**
    private static String getBuzzWord(int i) {
        String s = "";

        if (i % 3 == 0)
            s = s + "Fizz";
        if (i % 5 == 0)
            s = s + "Buzz";

        return !s.isEmpty() ? s : String.valueOf(i);
    }
}**/




    private static String getBuzzWord(int i) {
        if (i == 1) {
            return "1";
        }

        if (i / 3 == 1) {
            return "Fizz";
        }

        if (i / 5 == 1) {
            return "Buzz";
        }
    }
}

