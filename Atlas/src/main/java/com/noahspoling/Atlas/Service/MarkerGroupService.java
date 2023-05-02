package com.noahspoling.Atlas.Service;

import java.util.List;

import Atlas.DAO.MarkerGroupDAO;

public class MarkerGroupService {
    MarkerGroupDAO markerGroupDAO;
    
    public MarkerGroupService() {
        this.markerGroupDAO = new MarkerGroupDAO();
    }
}
