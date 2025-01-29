package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.VehicleBO;
import lk.ijse.gdse.finalproject.dao.custom.VehicleDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.VehicleDAOImpl;
import lk.ijse.gdse.finalproject.model.VehicleDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class VehicleBOImpl implements VehicleBO {
    VehicleDAO vehicleDAO = new VehicleDAOImpl();
    public String getNextVehicleId() throws SQLException, ClassNotFoundException {
        return vehicleDAO.getNextId();
    }
    public ArrayList<VehicleDto> getAllVehicles() throws SQLException, ClassNotFoundException {
        ArrayList<VehicleDto> vehicleDtos = vehicleDAO.getAll();
        return vehicleDtos;
    }
    public boolean saveVehicle(VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        return vehicleDAO.save(vehicleDto);
    }
    public boolean deleteVehicle(String vehicleId) throws SQLException, ClassNotFoundException {
        return  vehicleDAO.delete(vehicleId);
    }

    public boolean updateVehicle(VehicleDto vehicleDto) throws SQLException, ClassNotFoundException {
        return vehicleDAO.update(vehicleDto);
    }
    public ArrayList<String> getAllVehicleType() throws SQLException, ClassNotFoundException {
        return vehicleDAO.getAllVehicleType();
    }
}
