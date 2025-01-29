package lk.ijse.gdse.finalproject.bo.custom;

import lk.ijse.gdse.finalproject.model.SettingDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SettingBO {
    public SettingDto getSignupDetails() throws SQLException, ClassNotFoundException;
    public boolean editSignup(SettingDto settingDto) throws SQLException, ClassNotFoundException;
}
