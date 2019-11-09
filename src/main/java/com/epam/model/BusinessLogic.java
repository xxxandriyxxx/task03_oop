package com.epam.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BusinessLogic implements Model {

    Domain domain;

    public BusinessLogic() {
        domain = new Domain();
    }

    @Override
    public List<ElectricalAppliance> getApplianceList() {
        return domain.getApplianceList();
    }

    @Override
    public double getConnectionPower() {
        return domain.getConnectionPower();
    }

    @Override
    public List<ElectricalAppliance> getListSortedByPower() {
        List<ElectricalAppliance> sortedList = new ArrayList<>();
        sortedList.addAll(domain.getApplianceList());
        sortedList.sort(Comparator.comparing(ElectricalAppliance::getPower));
        return sortedList;
    }

    @Override
    public List<ElectricalAppliance> getTVsets() {
        return domain.getTVsets();
    }

    @Override
    public List<ElectricalAppliance> getVacuumCleaners() {
        return domain.getVacuumCleaners();
    }

    @Override
    public List<ElectricalAppliance> getLaptops() {
        return domain.getLaptops();
    }

}
