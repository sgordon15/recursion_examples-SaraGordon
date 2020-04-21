package edu.ti.caih313.recursion.simple;

enum DigitAsWord {
    ZERO(0, "zero"), ONE(1, "one"), TWO(2, "two"),
    THREE(3, "three"), FOUR(4, "four"), FIVE(5, "five"),
    SIX(6, "six"), SEVEN(7, "seven"), EIGHT(8, "eight"),
    NINE(9, "nine");
    private String digitWord;
    private int digit;

    private DigitAsWord(int digit, String digitWord) {
        this.digit = digit;
        this.digitWord = digitWord;
    }

    public int getDigit() {
        return digit;
    }

    public String getDigitWord() {
        return digitWord;
    }
}