package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.VehicleDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface VehicleDAO extends CrudDAO<VehicleDto>{
    ArrayList<String> getAllVehicleType() throws SQLException, ClassNotFoundException;
}
