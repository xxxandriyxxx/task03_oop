package com.epam.model;

public class Laptop extends ElectricalAppliance {

    private String operatingSystem;

    public Laptop(String name, int power, boolean isConnected, String operatingSystem) {
        super(name, power, isConnected);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "operatingSystem='" + operatingSystem + '\'' +
                "} " + super.toString();
    }

}
