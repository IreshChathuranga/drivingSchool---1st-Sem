package lk.ijse.gdse.finalproject.bo.custom;

import lk.ijse.gdse.finalproject.model.SigninDto;
import lk.ijse.gdse.finalproject.util.CrudUtil;

import java.sql.SQLException;

public interface SigninBO {
    public boolean saveAdmin(SigninDto signinDto) throws SQLException, ClassNotFoundException;
}
