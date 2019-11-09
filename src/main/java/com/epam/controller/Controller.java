package com.epam.controller;
import com.epam.model.ElectricalAppliance;
import java.util.List;

public interface Controller {

    List<ElectricalAppliance> getApplianceList();

    double getConnectionPower();

    List<ElectricalAppliance> getSortedByPower();

    List<ElectricalAppliance> getTVsets();

    List<ElectricalAppliance> getVacuumCleaners();

    List<ElectricalAppliance> getLaptops();
}
