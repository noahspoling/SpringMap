package com.noahspoling.Atlas;

import java.util.List;

import Atlas.DAO.MarkerGroupDAO;

public class MarkerGroupService {
    MarkerGroupDAO markerGroupDAO;
    
    public MarkerGroupService() {
        this.markerGroupDAO = new MarkerGroupDAO();
    }
}
