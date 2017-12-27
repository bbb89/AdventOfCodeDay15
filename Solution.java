package com.lukasz;


public class Solution {
    private final int GENERATOR_A_FACTOR = 16807;
    private final int GENERATOR_B_FACTOR = 48271;
    private final int DIVIDING_BY = 2147483647;
    private final int SAMPLE_SIZE = 40000000;

    private int matches;

    public Solution(int generatorAStart, int generatorBStart) {

        this.matches = 0;
        long currentA = generatorAStart;
        long currentB = generatorBStart;

        for(int i = 0; i < SAMPLE_SIZE; i++) {
            currentA = generateA(currentA);
            currentB = generateB(currentB);

            String aBinary = findLowest16Bits(currentA);
            String bBinary = findLowest16Bits(currentB);
            if(aBinary.equals(bBinary)) matches++;

        }
    }

    private String findLowest16Bits(long number) {
        String binary = Long.toBinaryString(number);

        if(binary.length() > 16) {
            binary = binary.substring(binary.length() - 16);
        }
        return binary;
    }

    private long generateA(long a) {
        a *= GENERATOR_A_FACTOR;
        a %= DIVIDING_BY;

        return a;
    }

    private long generateB(long b) {
        b *= GENERATOR_B_FACTOR;
        b %= DIVIDING_BY;

        return b;
    }

    public int getMatches() {
        return matches;
    }
}
