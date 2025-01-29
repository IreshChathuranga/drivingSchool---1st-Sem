package lk.ijse.gdse.finalproject.dao.custom;

import lk.ijse.gdse.finalproject.model.SettingDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface SettingDAO extends CrudDAO<SettingDto>{
    SettingDto getSignupDetails() throws SQLException, ClassNotFoundException;
}
