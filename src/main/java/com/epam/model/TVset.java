package com.epam.model;

public class TVset extends ElectricalAppliance {

    private int screenDiagonal;

    public TVset(String name, int power, boolean isConnected, int screenDiagonal) {
        super(name, power, isConnected);
        this.screenDiagonal = screenDiagonal;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "TVset{" +
                "screenDiagonal=" + screenDiagonal +
                "} " + super.toString();
    }

}
