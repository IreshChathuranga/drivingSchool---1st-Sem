package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.SettingBO;
import lk.ijse.gdse.finalproject.dao.custom.SettingDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.SettingDAOImpl;
import lk.ijse.gdse.finalproject.model.SettingDto;

import java.sql.SQLException;

public class SettingBOImpl implements SettingBO {
    SettingDAO settingDAO = new SettingDAOImpl();
    public SettingDto getSignupDetails() throws SQLException, ClassNotFoundException {
        return settingDAO.getSignupDetails();
    }
    public boolean editSignup(SettingDto settingDto) throws SQLException, ClassNotFoundException {
        return settingDAO.update(settingDto);
    }
}
