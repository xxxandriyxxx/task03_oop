package com.epam.model;

import java.util.List;

public interface Model {

    List<ElectricalAppliance> getApplianceList();

    int getConnectionPower();

    List<ElectricalAppliance> getSortedByPower();

    List<ElectricalAppliance> getTVsets();

    List<ElectricalAppliance> getVacuumCleaners();

    List<ElectricalAppliance> getLaptops();

}
