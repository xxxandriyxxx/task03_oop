package com.epam.model;

import java.util.List;

public interface Model {

    List<ElectricalAppliance> getApplianceList();

    List<ElectricalAppliance> getConnectionPower();

    List<ElectricalAppliance> getSortedList();

    List<ElectricalAppliance> getTVsets();

    List<ElectricalAppliance> getVacuumCleaners();

    List<ElectricalAppliance> getLaptops();

}
