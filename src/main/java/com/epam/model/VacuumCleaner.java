package com.epam.model;

public class VacuumCleaner extends ElectricalAppliance {

    private String color;

    public VacuumCleaner(String name, int power, boolean isConnected, String color) {
        super(name, power, isConnected);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

}
