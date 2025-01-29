package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.MaintainersBO;
import lk.ijse.gdse.finalproject.dao.custom.MaintainersDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.MaintainersDAOImpl;
import lk.ijse.gdse.finalproject.model.MaintainersDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class MaintainersBOImpl implements MaintainersBO {
    MaintainersDAO maintainersDAO = new MaintainersDAOImpl();
    public String getNextMaintainerId() throws SQLException, ClassNotFoundException {
       return maintainersDAO.getNextId();
    }

    public ArrayList<MaintainersDto> getAllMaintainer() throws SQLException, ClassNotFoundException {
        ArrayList<MaintainersDto> maintainersDtos = maintainersDAO.getAll();
        return maintainersDtos;
    }
    public boolean saveMaintainer(MaintainersDto maintainersDto) throws SQLException, ClassNotFoundException {
        return maintainersDAO.save(maintainersDto);
    }
    public boolean deleteMaintainer(String maintainId) throws SQLException, ClassNotFoundException {
        return maintainersDAO.delete(maintainId);
    }

    public boolean updateMaintainer(MaintainersDto maintainersDto) throws SQLException, ClassNotFoundException {
        return maintainersDAO.update(maintainersDto);
    }
}
