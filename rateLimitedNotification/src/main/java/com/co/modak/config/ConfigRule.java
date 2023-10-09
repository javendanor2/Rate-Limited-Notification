package com.co.modak.config;

public enum ConfigRule {

    STATE(1L * 60 * 1000, 2),
    NEWS(24L * 60 * 60 * 1000, 1),
    MARKETING(1L * 60 * 60 * 1000, 3);

    private long time;

    private int quantity;

    public long getTime() {
        return time;
    }

    public int getQuantity() {
        return quantity;

    }


    ConfigRule(long time, int quantity) {
        this.time = time;
        this.quantity = quantity;
    }
}