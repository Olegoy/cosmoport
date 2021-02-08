package com.space.service;

import com.space.model.Ship;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ShipServiceImpl implements ShipService {


    @Override
    public List<Ship> getAllShips() {
        List<Ship> ships = new ArrayList<>();
        return ships;
    }

    @Override
    public Ship createShip() {
        return new Ship();
    }

    @Override
    public void editShip() {

    }

    @Override
    public void deleteShip() {

    }

    @Override
    public Ship getShipById(Long id) {
        return null;
    }

    @Override
    public List<Ship> getShipsByFilter() {
        return null;
    }

    @Override
    public int getCountShips() {
        return getShipsByFilter().size();
    }

    public void calculateAndSetRating(Ship ship) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(ship.getProdDate());
        double k;
        if(ship.getUsed()) k = 0.5;
        else k = 1.0;
        ship.setRating((80 * ship.getSpeed() * k)/ (3019 - calendar.get(Calendar.YEAR) + 1));

    }

}
