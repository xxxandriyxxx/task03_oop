package com.epam.model;

public abstract class ElectricalAppliance {

    private String name;
    private int power;
    private boolean isConnected;

    public ElectricalAppliance(String name, int power, boolean isConnected) {
        this.name = name;
        this.power = power;
        this.isConnected = isConnected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        this.isConnected = connected;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", isConnected=" + isConnected +
                '}';
    }
}
