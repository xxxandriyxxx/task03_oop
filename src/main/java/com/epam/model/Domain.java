package com.epam.model;

import java.util.ArrayList;
import java.util.List;

public class Domain {

    private List<ElectricalAppliance> applianceList;

    public Domain() {
        applianceList = new ArrayList<>();
        ElectricalAppliance tvSet1 = new TVset("Samsung", 200, true, 32);
        addToList(tvSet1);
        ElectricalAppliance tvSet2 = new TVset("LG", 400, true, 50);
        addToList(tvSet2);
        ElectricalAppliance tvSet3 = new TVset("Toshiba", 300, false, 90);
        addToList(tvSet3);
        ElectricalAppliance vacuumCleaner1 = new VacuumCleaner("Bosh", 2000, true, "black");
        addToList(vacuumCleaner1);
        ElectricalAppliance vacuumCleaner2 = new VacuumCleaner("Rowenta", 1500, false, "silver");
        addToList(vacuumCleaner2);
        ElectricalAppliance vacuumCleaner3 = new VacuumCleaner("Electrolux", 2100, false, "blue");
        addToList(vacuumCleaner3);
        ElectricalAppliance vacuumCleaner4 = new VacuumCleaner("Philips", 1800, false, "blue");
        addToList(vacuumCleaner4);
        ElectricalAppliance laptop1 = new Laptop("HP", 100, true, "Windows");
        addToList(laptop1);
        ElectricalAppliance laptop2 = new Laptop("Dell", 90, true, "Linux");
        addToList(laptop2);
        ElectricalAppliance laptop3 = new Laptop("Apple", 120, false, "MacOS");
        addToList(laptop3);
    }

    private void addToList(ElectricalAppliance appliance) {
        applianceList.add(appliance);
    }

    public List<ElectricalAppliance> getApplianceList() {
        return applianceList;
    }

    public int getConnectionPower() {
        int power = 0;
        for (ElectricalAppliance appliance : applianceList) {
            if (appliance.isConnected()) {
                power += appliance.getPower();
            }
        }
        return power;
    }

    public List<ElectricalAppliance> getTVsets() {
        List<ElectricalAppliance> tvSets = new ArrayList<>();
        for (ElectricalAppliance appliance : applianceList) {
            if (appliance.getClass().getSimpleName().equals("TVset")) {
                tvSets.add(appliance);
            }
        }
        return tvSets;
    }

    public List<ElectricalAppliance> getVacuumCleaners() {
        List<ElectricalAppliance> vacuumCleaners = new ArrayList<>();
        for (ElectricalAppliance appliance : applianceList) {
            if (appliance.getClass().getSimpleName().equals("VacuumCleaner")) {
                vacuumCleaners.add(appliance);
            }
        }
        return vacuumCleaners;
    }

    public List<ElectricalAppliance> getLaptops() {
        List<ElectricalAppliance> laptops = new ArrayList<>();
        for (ElectricalAppliance appliance : applianceList) {
            if (appliance.getClass().getSimpleName().equals("Laptop")) {
                laptops.add(appliance);
            }
        }
        return laptops;
    }

}
