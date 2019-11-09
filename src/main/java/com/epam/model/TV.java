package com.epam.model;

public class TV extends ElectricalAppliance {

    private int screenDiagonal;

    public TV(String name, int power, boolean isConnected) {
        super(name, power, isConnected);
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "TV{" +
                "screenDiagonal=" + screenDiagonal +
                "} " + super.toString();
    }

}
