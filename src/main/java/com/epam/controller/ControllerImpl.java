package com.epam.controller;

import com.epam.model.BusinessLogic;
import com.epam.model.ElectricalAppliance;
import com.epam.model.Model;

import java.util.List;

public class ControllerImpl implements Controller {

    private Model model;

    public ControllerImpl() {
        model = new BusinessLogic();
    }

    @Override
    public List<ElectricalAppliance> getApplianceList() {
        return model.getApplianceList();
    }

    @Override
    public int getConnectionPower() {
        return model.getConnectionPower();
    }

    @Override
    public List<ElectricalAppliance> getSortedByPower() {
        return model.getSortedByPower();
    }

    @Override
    public List<ElectricalAppliance> getTVsets() {
        return model.getTVsets();
    }

    @Override
    public List<ElectricalAppliance> getVacuumCleaners() {
        return model.getVacuumCleaners();
    }

    @Override
    public List<ElectricalAppliance> getLaptops() {
        return model.getLaptops();
    }
}
