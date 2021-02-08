package com.space.service;

import com.space.model.Ship;

import java.util.List;

public interface ShipService {
    public List<Ship> getAllShips();
    public Ship createShip();
    public void editShip();
    public void deleteShip();
    public Ship getShipById(Long id);
    public List<Ship> getShipsByFilter();
    public int getCountShips();
}
