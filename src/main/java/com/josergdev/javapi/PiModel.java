package com.josergdev.javapi;

public class PiModel {

    private final int digits;
    private final String result;

    public PiModel(int digits, String result) {
        this.digits = digits;
        this.result = result;
    }

    public int getDigits() {
        return digits;
    }

    public String getResult() {
        return result;
    }
}
