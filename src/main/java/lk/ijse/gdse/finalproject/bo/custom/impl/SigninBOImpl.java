package lk.ijse.gdse.finalproject.bo.custom.impl;

import lk.ijse.gdse.finalproject.bo.custom.SigninBO;
import lk.ijse.gdse.finalproject.dao.custom.SigninDAO;
import lk.ijse.gdse.finalproject.dao.custom.impl.SigninDAOImpl;
import lk.ijse.gdse.finalproject.model.SigninDto;

import java.sql.SQLException;

public class SigninBOImpl implements SigninBO {
    SigninDAO signinDAO = new SigninDAOImpl();
    public boolean saveAdmin(SigninDto signinDto) throws SQLException, ClassNotFoundException {
        return signinDAO.save(signinDto);
    }
}
